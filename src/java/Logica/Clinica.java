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

    public String redirigirUsuario(String usuario) {
        switch (usuario) {
            case "Odontologo":
                pagina = "pagina-Odontologo.jsp";
                //return pagina;
                break;
            case "Secretaria":
                pagina = "carga-Pacientes.jsp";
                //return pagina;
                break;
            default:
                pagina = "index.jsp";
                break;
        }
        return pagina;
    }

    public void buscarUsuario(String usuario) {

    }
}
