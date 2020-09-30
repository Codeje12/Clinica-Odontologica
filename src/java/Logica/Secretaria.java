package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Secretaria extends Persona implements Serializable {
    
    @Id
    private int id_Secretaria;
    @Basic
    String Horario;
    @OneToOne
    private Usuario usuario;

    public Secretaria() {
    }

    public Secretaria(int id_Secretaria, Usuario usuario, String nombre, String apellido, String dni, String edad) {
        super(nombre, apellido, dni, edad);
        this.id_Secretaria = id_Secretaria;
        this.usuario = usuario;
    }

    public int getId_Secretaria() {
        return id_Secretaria;
    }

    public void setId_Secretaria(int id_Secretaria) {
        this.id_Secretaria = id_Secretaria;
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

}
