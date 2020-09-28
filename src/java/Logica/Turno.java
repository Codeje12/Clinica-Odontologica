package Logica;

public class Turno {
    private int id_Turno;
    private String dia;
    private String hora;
    private String tratamiento;
    private String diagnostico;
    private Odontologo odontologo;
    private int costo;

    public Turno() {
    }

    public Turno(int id_Turno, String dia, String hora, String tratamiento, String diagnostico, Odontologo odontologo, int costo) {
        this.id_Turno = id_Turno;
        this.dia = dia;
        this.hora = hora;
        this.tratamiento = tratamiento;
        this.diagnostico = diagnostico;
        this.odontologo = odontologo;
        this.costo = costo;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    
}
