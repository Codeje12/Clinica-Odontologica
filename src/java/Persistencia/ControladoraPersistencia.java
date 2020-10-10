package Persistencia;

import Logica.Odontologo;
import static Logica.Odontologo_.usuario;
import Logica.Paciente;
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

    public List<Turno> traerTurno() {
        List<Turno> listaTurno;
        listaTurno = this.turnoJpa.findTurnoEntities();
        return listaTurno;
    }

    public void eliminarPaciente(String dni) {
        List<Paciente> listaPaciente = this.pacienteJpa.findPacienteEntities();
        for (Paciente pac : listaPaciente) {
            if (pac.getDni().equals(dni)) {
                try {
                    this.pacienteJpa.destroy(pac.getId());
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
        List<Paciente> listaPaciente = this.pacienteJpa.findPacienteEntities();
        try {
            if (buscarPaciente(paciente.getDni())) {
                for (Paciente pac : listaPaciente) {
                    if (pac.getDni().equals(paciente.getDni())) {
                        this.pacienteJpa.edit(paciente);
                    }

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Paciente> traerPaciente() {
        List<Paciente> listaPaciente;
        listaPaciente = this.pacienteJpa.findPacienteEntities();
        return listaPaciente;
    }

    public List<Odontologo> traerOdontologo() {
        List<Odontologo> listaOdontologo;
        listaOdontologo = this.odontologoJpa.findOdontologoEntities();
        return listaOdontologo;
    }
}
