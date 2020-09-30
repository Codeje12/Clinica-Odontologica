package Logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona  {

    @Id
    int id_Odontologo;
    @Basic
     String especialidad;
     String horarioTrabajo;
   @OneToOne
     Usuario usuario;
   
   public Odontologo(){
   }

    public Odontologo(int id_Odontologo, String especialidad, String horarioTrabajo, Usuario usuario, String nombre, String apellido, String dni, String edad) {
        super(nombre, apellido, dni, edad);
        this.id_Odontologo = id_Odontologo;
        this.especialidad = especialidad;
        this.horarioTrabajo = horarioTrabajo;
        this.usuario = usuario;
    }

    public int getId_Odontologo() {
        return id_Odontologo;
    }

    public void setId_Odontologo(int id_Odontologo) {
        this.id_Odontologo = id_Odontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
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
