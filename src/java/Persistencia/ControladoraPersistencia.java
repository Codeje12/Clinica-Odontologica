package Persistencia;
import Logica.Paciente;

public class ControladoraPersistencia {
    
    PacienteJpaController pacienteJpa = new PacienteJpaController();
    OdontologoJpaController odontologoJpa = new OdontologoJpaController();
    SecretariaJpaController secretariaJpa = new SecretariaJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    
    
    public void crearPaciente(Paciente paciente){
        try{
            pacienteJpa.create(paciente);
        }catch(Exception ex){
            System.out.println("Error"+ ex);
        }
    }
    
    
}
