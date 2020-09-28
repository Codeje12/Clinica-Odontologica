package Logica;

import Persistencia.ControladoraPersistencia;

public class Clinica {

    ControladoraPersistencia persistencia = new ControladoraPersistencia();

    public void crearPaciente(String nombre, String apellido, String dni, String sexo,String edad, String direccion, boolean obra, boolean tutor, String contacto) {
        Paciente pac = new Paciente();

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

    }

}
