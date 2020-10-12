package Persistencia;

import Logica.Odontologo;
import static Logica.Odontologo_.usuario;
import Logica.Paciente;
import Logica.Secretaria;
import Logica.Turno;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PacienteJpaController pacienteJpa = new PacienteJpaController();
    OdontologoJpaController odontologoJpa = new OdontologoJpaController();
    SecretariaJpaController secretariaJpa = new SecretariaJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();

    public void crearPaciente(Paciente paciente) {
        try {
            pacienteJpa.create(paciente);
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public List<Usuario> accederLogin() {
        List<Usuario> listaUsuarios;
        listaUsuarios = usuarioJpa.findUsuarioEntities();
        return listaUsuarios;
    }

    public void crearOdontologo(Odontologo odon) {
        try {
            this.odontologoJpa.create(odon);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearTurno(Turno tur) {
        try {
            turnoJpa.create(tur);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPaciente(int id) {
        List<Paciente> listaPaciente = this.pacienteJpa.findPacienteEntities();
        for (Paciente pac : listaPaciente) {
            if (pac.getId()==id) {
                try {
                    this.pacienteJpa.destroy(pac.getId());
                    break;
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void eliminarTurno(int turnoId) {
        List<Turno> listaTurno = this.turnoJpa.findTurnoEntities();
        for (Turno tur : listaTurno) {
            if (tur.getId_Turno() == turnoId) {
                try {
                    this.turnoJpa.destroy(tur.getId_Turno());
                    break;
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void eliminarOdontologo(int idOdontologo) {
        List<Odontologo> listaOdontologo = this.odontologoJpa.findOdontologoEntities();
        for (Odontologo odo : listaOdontologo) {
            if (odo.getId() == idOdontologo) {
                try {
                    this.odontologoJpa.destroy(odo.getId());
                    break;
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean buscarPaciente(String dni) {
        boolean valor = false;
        List<Paciente> listaPaciente = this.pacienteJpa.findPacienteEntities();
        for (Paciente pac : listaPaciente) {
            if (pac.getDni().equals(dni)) {
                valor = true;
                return valor;
            }
        }
        return valor;
    }

    public void modificarPaciente(Paciente paciente) {
        try {
            this.pacienteJpa.edit(paciente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificarTurno(Turno turno) {
        try {
            this.turnoJpa.edit(turno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Odontologo odontologo) {
        try {
            this.odontologoJpa.edit(odontologo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Paciente> traerPaciente() {
        List<Paciente> listaPaciente;
        listaPaciente = this.pacienteJpa.findPacienteEntities();
        return listaPaciente;
    }

    public Paciente traerPacienteUnico(int id) {
        Paciente pac2 = null;
        List<Paciente> listaPaciente;
        listaPaciente = traerPaciente();
        for (Paciente pac : listaPaciente) {
            if (pac.getId() == id) {
                pac2 = pac;
            }
        }
        return pac2;
    }
    public Paciente traerPacienteUnicoDni(String dni) {
        Paciente paciente = null;
        List<Paciente> listaPaciente;
        listaPaciente = traerPaciente();
        for (Paciente pac : listaPaciente) {
            if (pac.getDni().equals(dni)) {
                paciente = pac;
                return paciente;
            }
        }
        return paciente;
    }

    public List<Turno> traerTurno() {
        List<Turno> listaTurno;
        listaTurno = this.turnoJpa.findTurnoEntities();
        return listaTurno;
    }

    public Turno traerTurnoUnico(int id) {
        Turno turn = null;
        List<Turno> listaTurno;
        listaTurno = traerTurno();
        for (Turno tur : listaTurno) {
            if (tur.getId_Turno() == id) {
                turn = tur;
                return turn;
            }
        }
        return turn;
    }

    public List<Odontologo> traerOdontologo() {
        List<Odontologo> listaOdontologo;
        listaOdontologo = this.odontologoJpa.findOdontologoEntities();
        return listaOdontologo;
    }

    public Odontologo traerOdontologoUnico(int id) {
        Odontologo odon2 = null;
        List<Odontologo> listaOdontolo;
        listaOdontolo = traerOdontologo();
        for (Odontologo odont : listaOdontolo) {
            if (odont.getId() == id) {
                odon2 = odont;
            }
        }
        return odon2;
    }

    public Odontologo traerOdontologoUnico(String dni) {
        Odontologo odontologo = null;
        List<Odontologo> listaOdontologo;
        listaOdontologo = traerOdontologo();
        for (Odontologo odo : listaOdontologo) {
            if (odo.getDni().equals(dni)) {
                odontologo = odo;
                return odontologo;
            }
        }
        return odontologo;
    }

    

    public void crearSecretaria(Secretaria secre) {
        try {
            secretariaJpa.create(secre);
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
     public List<Secretaria> traerSecretaria() {
        List<Secretaria> listaSecretaria;
        listaSecretaria = this.secretariaJpa.findSecretariaEntities();
        return listaSecretaria;
    }

    public Secretaria traerSecretariaUnico(String dni) {
        Secretaria secretaria = null;
        List<Secretaria> listaSecretaria;
        listaSecretaria = traerSecretaria();
        for (Secretaria secre : listaSecretaria) {
            if (secre.getDni().equals(dni)) {
                secretaria = secre;
                return secre;
            }
        }
        return secretaria;
    }

    public void modificarSecretaria(Secretaria secre) {
        try {
            this.secretariaJpa.edit(secre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarSecretaria(String dni) {
        List<Secretaria> listaSecretaria = this.secretariaJpa.findSecretariaEntities();
        for (Secretaria secre : listaSecretaria) {
            if (secre.getDni().equals(dni)) {
                try {
                    this.odontologoJpa.destroy(secre.getId());
                    break;
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
