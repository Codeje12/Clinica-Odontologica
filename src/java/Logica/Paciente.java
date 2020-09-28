package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente extends Persona implements Serializable {

    @Id
    int id_Paciente;
    @Basic
    String sexo;
    String direccion;
    boolean tutor;
    String contactoTutor;
    boolean obraSocial;

    public Paciente() {
    }

    public Paciente(int id_Paciente, String sexo, String direccion, boolean tutor, String contactoTutor, boolean obraSocial, String nombre, String apellido, String dni, String edad) {
        super(nombre, apellido, dni, edad);
        this.id_Paciente = id_Paciente;
        this.sexo = sexo;
        this.direccion = direccion;
        this.tutor = tutor;
        this.contactoTutor = contactoTutor;
        this.obraSocial = obraSocial;
    }

    public int getId_Paciente() {
        return id_Paciente;
    }

    public void setId_Paciente(int id_Paciente) {
        this.id_Paciente = id_Paciente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isTutor() {
        return tutor;
    }

    public void setTutor(boolean tutor) {
        this.tutor = tutor;
    }

    public String getContactoTutor() {
        return contactoTutor;
    }

    public void setContactoTutor(String contactoTutor) {
        this.contactoTutor = contactoTutor;
    }

    public boolean isObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
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
    
 