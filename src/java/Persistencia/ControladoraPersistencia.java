package Persistencia;
import static Logica.Odontologo_.usuario;
import Logica.Paciente;
import Logica.Usuario;

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
    
    
     public Usuario accederLogin(int id){
        Usuario usu = usuarioJpa.findUsuario(id);
        return usu;
    }
    
}
