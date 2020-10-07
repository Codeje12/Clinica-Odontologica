package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

public class Clinica {
    private List<Usuario> listUsuario; 
    ControladoraPersistencia persistencia = new ControladoraPersistencia();

    public void crearPaciente(String nombre, String apellido, String dni, String sexo, String edad, String direccion, boolean obra, boolean tutor, String contacto) {
        Paciente pac = new Paciente();

        try {
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

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

    }

    /* Verificacion vieja
    String pagina;

    public String verficacionAcceso(String usuario, String password) {
        int id;
        // codigo improvisado para que funcione el login en la entrega
        switch (usuario) {
            case "odontologo":
                id = 1;
                break;
            case "secretaria":
                id = 2;
                break;
            default:
                id = 0;
                break;
        }
        Usuario user = this.persistencia.accederLogin(id);
        if (id != 0) {
            if (password != "" || password != null) {
                if (user.getUsuario().equals(usuario) && user.getPass().equals(password)) {
                    this.pagina = "inicio.jsp";
                } else {
                    this.pagina = "index.jsp";
                }
            } else {
                this.pagina = "index.jsp";
            }
        } else {
            this.pagina = "index.jsp";

        }

        return pagina;
    }*/

    public void crearOdontologo(String nombre, String apellido, String dni, String edad, String especialidad, String horarioTrabajo) {
        Odontologo odon = new Odontologo();

        try {

            odon.setNombre(nombre);
            odon.setApellido(apellido);
            odon.setDni(dni);
            odon.setEdad(edad);
            odon.setEspecialidad(especialidad);
            odon.setHorarioTrabajo(horarioTrabajo);

            persistencia.crearOdontologo(odon);
        } catch (Exception ex) {
            System.out.println("error " + ex);
        }
    }

    public boolean verficacionAcceso(String usuario, String password) {
        boolean permiso = false;
        this.listUsuario = this.persistencia.accederLogin();
        
        for(Usuario user : this.listUsuario){
            if(user.getUsuario().equals(usuario) && user.getPass().equals(password)){
                permiso = true;
                return permiso;
            }
        }
        return permiso;
    }

}
