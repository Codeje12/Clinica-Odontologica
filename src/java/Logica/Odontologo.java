package Logica;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona{
    String especialidad;
    String horarioInicioTrabajo;
    String horarioFinTrabajo;
    @OneToOne
    Usuario usuario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, String horarioInicioTrabajo, String horarioFinTrabajo, Usuario usuario) {
        this.especialidad = especialidad;
        this.horarioInicioTrabajo = horarioInicioTrabajo;
        this.horarioFinTrabajo = horarioFinTrabajo;
        this.usuario = usuario;
    }

    public String getHorarioinicioTrabajo() {
        return horarioInicioTrabajo;
    }

    public void setHorarioInicioTrabajo(String horarioInicioTrabajo) {
        this.horarioInicioTrabajo = horarioInicioTrabajo;
    }

    public String getHorarioFinTrabajo() {
        return horarioFinTrabajo;
    }

    public void setHorarioFinTrabajo(String horarioFinTrabajo) {
        this.horarioFinTrabajo = horarioFinTrabajo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
