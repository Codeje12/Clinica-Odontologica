package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

public class Clinica {

    private List<Usuario> listUsuario;
    ControladoraPersistencia persistencia = new ControladoraPersistencia();

    public boolean crearPaciente(String nombre, String apellido, String dni, String sexo, String edad, String direccion, boolean obra, boolean tutor, String contacto) {
        Paciente pac = new Paciente();
        boolean valor = false;

        try {
            if ((nombre == null || nombre == "") || (apellido == null || apellido == "")
                    || (dni == null || dni == "") || (edad == null || edad == "")) {
                valor = false;
                return valor;
            } else {
                pac.setNombre(nombre);
                pac.setApellido(apellido);
                pac.setDni(dni);
                pac.setSexo(sexo);
                pac.setEdad(edad);
                pac.setDireccion(direccion);
                pac.setObraSocial(obra);
                pac.setTutor(tutor);
                pac.setContactoTutor(contacto);

                persistencia.crearPaciente(pac);
                valor = true;
                return valor;
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return valor;

    }

    public boolean crearOdontologo(String nombre, String apellido, String dni, String edad, String especialidad, String horarioInicioTrabajo, String horarioFinTrabajo) {
        Odontologo odon = new Odontologo();

        boolean valor = false;

        try {
            if ((nombre == null || nombre == "") || (apellido == null || apellido == "")
                    || (dni == null || dni == "") || (edad == null || edad == "")) {
                valor = false;
                return valor;
            } else {
                odon.setNombre(nombre);
                odon.setApellido(apellido);
                odon.setDni(dni);
                odon.setEdad(edad);
                odon.setEspecialidad(especialidad);
                odon.setHorarioInicioTrabajo(horarioInicioTrabajo);
                odon.setHorarioFinTrabajo(horarioFinTrabajo);

                persistencia.crearOdontologo(odon);

                valor = true;
                return valor;
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return valor;
    }

    public boolean verficacionAcceso(String usuario, String password) {
        boolean permiso = false;
        this.listUsuario = this.persistencia.accederLogin();

        for (Usuario user : this.listUsuario) {
            if (user.getUsuario().equals(usuario) && user.getPass().equals(password)) {
                permiso = true;
                return permiso;
            }
        }
        return permiso;
    }

    public boolean crearTurno(String dia, String hora, String tratamiento, String diagnostico, double costo, int odontologo, int paciente) {
        Turno tur = new Turno();
        boolean valor = false;
        try {
            tur.setDia(dia);
            tur.setHora(hora);
            tur.setTratamiento(tratamiento);
            tur.setDiagnostico(diagnostico);
            tur.setCosto(costo);
            Odontologo odo = this.persistencia.traerOdontologoUnico(odontologo);
            tur.setOdontologo(odo);
            Paciente paci = this.persistencia.traerPacienteUnico(paciente);
            tur.setPacient(paci);
            persistencia.crearTurno(tur);
            valor = true;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            valor = false;
        }
        return valor;
    }

    public List<Turno> traerTurnos() {

        return persistencia.traerTurno();
    }

    String pagina;

    public void eliminarPaciente(String dni) {
        this.persistencia.eliminarPaciente(dni);
    }

    public void eliminarOdontologo(String dni) {
        this.persistencia.eliminarOdontologo(dni);
    }
    public void eliminarTurno(int paciente) {
        this.persistencia.eliminarTurno(paciente);
    }

    public void modificarPaciente(String nombre, String apellido, String dni, String edad, String direccion, boolean obra, boolean tutor, String contacto) {
        Paciente pac = persistencia.traerPacienteUnico(dni);

        try {
            pac.setNombre(nombre);
            pac.setApellido(apellido);
            pac.setEdad(edad);
            pac.setDireccion(direccion);
            pac.setObraSocial(obra);
            pac.setTutor(tutor);
            pac.setContactoTutor(contacto);
            this.persistencia.modificarPaciente(pac);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

    public void modificarTurno(String dia, String hora, String tratamiento, String diagnostico, double costo, int odontologo, int paciente) {
        Turno tur = persistencia.traerTurnoUnico(paciente);

        try {
            tur.setDia(dia);
            tur.setHora(hora);
            tur.setTratamiento(tratamiento);
            tur.setDiagnostico(diagnostico);
            tur.setCosto(costo);
            this.persistencia.modificarTurno(tur);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

    public List<Paciente> traerPaciente() {
        return persistencia.traerPaciente();
    }

    public List<Odontologo> traerOdontologo() {
        return persistencia.traerOdontologo();
    }

    public void modificarOdontologo(String nombre, String apellido, String dni, String edad, String horarioInicioTrabajo, String horarioFinTrabajo) {
        Odontologo odo = persistencia.traerOdontologoUnico(dni);

        try {
            odo.setNombre(nombre);
            odo.setApellido(apellido);
            odo.setEdad(edad);
            odo.setHorarioInicioTrabajo(horarioInicioTrabajo);
            odo.setHorarioFinTrabajo(horarioFinTrabajo);
            
            this.persistencia.modificar(odo);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

    
}
