package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Secretaria extends Persona {

    @Basic
    String Horario;
    @OneToOne
    Usuario usuario;

    public Secretaria() {
    }

    public Secretaria(String Horario, Usuario usuario, String nombre, String apellido, String dni, String edad) {
        super(nombre, apellido, dni, edad);
        this.Horario = Horario;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Secretaria crear(String nombre, String apellido, String dni, String hora) {
        try {
            if ((nombre == null || nombre == "") || (apellido == null || apellido == "")
                    || (dni == null || dni == "") || (edad == null || edad == "")) {
                System.out.println("no");
            } else {
                this.setNombre(nombre);
                this.setApellido(apellido);
                this.setDni(dni);
                this.setHorario(hora);
                return this;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        }
        return this;
    }

    public void modificar(String nombre, String apellido, String dni, String hora) {
        try {
            this.setNombre(nombre);
            this.setApellido(apellido);
            this.setDni(dni);
            this.setHorario(hora);

        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

}
