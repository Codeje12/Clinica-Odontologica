package Persistencia;
import Logica.Paciente;

public class ControladoraPersistencia {
    
    PacienteJpaController pacienteJpa = new PacienteJpaController();
    
    public void crearPaciente(Paciente paciente){
        try{
            pacienteJpa.create(paciente);
        }catch(Exception ex){
            System.out.println("Error"+ ex);
        }
    }
    
}
