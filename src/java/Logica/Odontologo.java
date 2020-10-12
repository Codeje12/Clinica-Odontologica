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

    public Odontologo(String especialidad, String horarioInicioTrabajo, String horarioFinTrabajo, Usuario usuario, String nombre, String apellido, String dni, String edad) {
        super(nombre, apellido, dni, edad);
        this.especialidad = especialidad;
        this.horarioInicioTrabajo = horarioInicioTrabajo;
        this.horarioFinTrabajo = horarioFinTrabajo;
        this.usuario = usuario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    public Odontologo crear(String nombre, String apellido, String dni, String edad, String especialidad, String horarioInicioTrabajo, String horarioFinTrabajo) {

        try {
            if ((nombre == null || nombre == "") || (apellido == null || apellido == "")
                    || (dni == null || dni == "") || (edad == null || edad == "")) {
                System.out.println("Error");
            } else {
                this.setNombre(nombre);
                this.setApellido(apellido);
                this.setDni(dni);
                this.setEdad(edad);
                this.setEspecialidad(especialidad);
                this.setHorarioInicioTrabajo(horarioInicioTrabajo);
                this.setHorarioFinTrabajo(horarioFinTrabajo);
                return this;
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        }
        return this;
    }
    
    public void modificar(String nombre, String apellido, String dni, String edad, String horarioInicioTrabajo, String horarioFinTrabajo) {
        try {
            this.setNombre(nombre);
            this.setApellido(apellido);
            this.setEdad(edad);
            this.setHorarioInicioTrabajo(horarioInicioTrabajo);
            this.setHorarioFinTrabajo(horarioFinTrabajo);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }
 
}
