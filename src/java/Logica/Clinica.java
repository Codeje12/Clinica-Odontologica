package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;
import javax.servlet.http.HttpSession;

public class Clinica {

    private List<Usuario> listUsuario;
    ControladoraPersistencia persistencia = new ControladoraPersistencia();

    /**
     * ********** Paciente ********************
     */
    public boolean crear(String nombre, String apellido, String dni, String sexo, String edad, String direccion, boolean obra, boolean tutor, String contacto) {
        Paciente pac = new Paciente();
        boolean valor = false;
        if (pac.crear(nombre, apellido, dni, sexo, edad, direccion, obra, tutor, contacto) != null) {
            persistencia.crearPaciente(pac);
            valor = true;
        }
        return valor;
    }

    public void modificar(String nombre, String apellido, String dni, String edad, String direccion, boolean obra, boolean tutor, String contacto, int idPaciente) {
        Paciente pac = new Paciente();
        pac = persistencia.traerPacienteUnico(idPaciente);
        pac.modificar(nombre, apellido, edad, direccion, obra, tutor, contacto);
        this.persistencia.modificarPaciente(pac);
    }

    public void eliminarPaciente(int id) {
        this.persistencia.eliminarPaciente(id);
    }

    public List<Paciente> traerPaciente() {
        return persistencia.traerPaciente();
    }

    /**
     * ********** Odontologo ********************
     */
    public boolean crear(String nombre, String apellido, String dni, String edad, String especialidad, String horarioInicioTrabajo, String horarioFinTrabajo) {
        Odontologo odo = new Odontologo();
        boolean valor = false;
        if (odo.crear(nombre, apellido, dni, edad, especialidad, horarioInicioTrabajo, horarioFinTrabajo) != null) {
            persistencia.crearOdontologo(odo);
            valor = true;
        }
        return valor;
    }

    public void modificar(String nombre, String apellido, String dni, String edad, String horarioInicioTrabajo, String horarioFinTrabajo) {
        Odontologo odo = persistencia.traerOdontologoUnico(dni);
        odo.modificar(nombre, apellido, dni, edad, horarioInicioTrabajo, horarioFinTrabajo);
        this.persistencia.modificar(odo);
    }

    public void eliminarOdontologo(String dni) {
        this.persistencia.eliminarOdontologo(dni);
    }

    public List<Odontologo> traerOdontologo() {
        return persistencia.traerOdontologo();
    }

    /**
     * ********** Login ********************
     */
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

    /**
     * ********** Turnos ********************
     */
    public boolean crear(String dia, String hora, String tratamiento, String diagnostico, double costo, int odontologo, int paciente) {
        Turno tur = new Turno();
        boolean valor = false;
        if (tur.crear(dia, hora, tratamiento, diagnostico, costo) != null) {
            Odontologo odo = this.persistencia.traerOdontologoUnico(odontologo);
            tur.setOdontologo(odo);
            Paciente paci = this.persistencia.traerPacienteUnico(paciente);
            tur.setPacient(paci);
            persistencia.crearTurno(tur);
            valor = true;
        }

        return valor;
    }

    public void modificar(String dia, String hora, String tratamiento, String diagnostico, double costo, int turnoId) {
        Turno tur = persistencia.traerTurnoUnico(turnoId);

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

    public List<Turno> traerTurnos() {

        return persistencia.traerTurno();
    }

    String pagina;

    public void eliminarTurno(int turnoId) {
        this.persistencia.eliminarTurno(turnoId);
    }

    /**
     * *********SECRETARIAS************
     */
    public boolean crear(String nombre, String apellido, String dni, String horario) {
        Secretaria secre = new Secretaria();
        boolean valor = false;
        if (secre.crear(nombre, apellido, dni, horario) != null) {
            persistencia.crearSecretaria(secre);
            valor = true;
        }
        return valor;
    }

    public void modificar(String nombre, String apellido, String dni, String horario) {
        Secretaria secre = persistencia.traerSecretariaUnico(dni);
        secre.modificar(nombre, apellido, dni, horario);
        this.persistencia.modificarSecretaria(secre);
    }

    public void eliminarSecretaria(String dni) {
        this.persistencia.eliminarSecretaria(dni);
    }  
}
