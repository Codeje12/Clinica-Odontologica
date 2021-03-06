package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Turno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_Turno;
    @Basic
    String dia;
    String hora;
    String tratamiento;
    String diagnostico;
    double costo;

    @OneToOne
    Odontologo odontologo;
    Paciente pacient;

    public Turno() {
    }

    public Turno(int id_Turno, String dia, String hora, String tratamiento, String diagnostico, Odontologo odontologo, double costo) {
        this.id_Turno = id_Turno;
        this.dia = dia;
        this.hora = hora;
        this.tratamiento = tratamiento;
        this.diagnostico = diagnostico;
        this.odontologo = odontologo;
        this.costo = costo;
    }

    public Paciente getPacient() {
        return pacient;
    }

    public void setPacient(Paciente pacient) {
        this.pacient = pacient;
    }

    public int getId_Turno() {
        return id_Turno;
    }

    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void realizarTurno(Odontologo odont, Paciente pac) {

    }

    public Turno crear(String dia, String hora, String tratamiento, String diagnostico, double costo) {
        try {
            this.setDia(dia);
            this.setHora(hora);
            this.setTratamiento(tratamiento);
            this.setDiagnostico(diagnostico);
            this.setCosto(costo);

 
            return this;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        }
    
    }
}
