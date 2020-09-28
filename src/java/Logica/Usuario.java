
package Logica;


public class Usuario {
    private int id_Usuario;
    private String usuario;
    private String pass;

    public Usuario() {
    }

    public Usuario(int id_Usuario, String usuario, String pass) {
        this.id_Usuario = id_Usuario;
        this.usuario = usuario;
        this.pass = pass;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
