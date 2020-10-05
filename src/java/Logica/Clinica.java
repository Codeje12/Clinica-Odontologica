package Logica;

import Persistencia.ControladoraPersistencia;

public class Clinica {

    ControladoraPersistencia persistencia = new ControladoraPersistencia();

    public void crearPaciente(String nombre, String apellido, String dni, String sexo, String edad, String direccion, boolean obra, boolean tutor, String contacto) {
        Paciente pac = new Paciente();

        try {
            pac.setId_Paciente(2);
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
    
    
    String pagina;
    public String verficacionAcceso(String usuario, String password) {
        int id;
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
        Usuario user = new Usuario();
        user = this.persistencia.accederLogin(id);

        if (!(password == "" && password == null)) {
            if (user.getUsuario().equals(usuario) && user.getPass().equals(password)) {
                this.pagina = "inicio.jsp";
            }
        } else {
            this.pagina = "index.jsp";
        }
        return pagina;
    }

    
}
