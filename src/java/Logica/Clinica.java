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
    
    public String redirigirUsuario(String usuario){
        String aviso = "index.jsp";
        if(!(usuario.equals("Odontologo") && usuario.equals("Secretaria"))) {
            switch(usuario){
                case "Odonotolo":
                    return "pagina-Odontolo.jsp";
                case "Secretaria":
                    return "carga-pacientes.jsp" ;
                default:
                    return aviso;
            }
        }
        return null;
    }
}
