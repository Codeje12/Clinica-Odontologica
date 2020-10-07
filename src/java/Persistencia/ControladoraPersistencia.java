package Persistencia;

import Logica.Odontologo;
import static Logica.Odontologo_.usuario;
import Logica.Paciente;
import Logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PacienteJpaController pacienteJpa = new PacienteJpaController();
    OdontologoJpaController odontologoJpa = new OdontologoJpaController();
    SecretariaJpaController secretariaJpa = new SecretariaJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();

    public void crearPaciente(Paciente paciente) {
        try {
            pacienteJpa.create(paciente);
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public List<Usuario> accederLogin() {
        List<Usuario> listaUsuarios;
        listaUsuarios = usuarioJpa.findUsuarioEntities();
        return listaUsuarios;
    }

    public void crearOdontologo(Odontologo odon) {
        try {
            this.odontologoJpa.create(odon);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
