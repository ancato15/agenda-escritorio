
package modelo;

import java.util.Date;



public class cita {
    
    private int idcita;
    private int idcontacto;
    private Date fecha;
    private String hora;
    private String lugar;
    private String asunto;

    public cita() {
    }

    public cita(int idcita, int idcontacto, Date fecha, String hora, String lugar, String asunto) {
        this.idcita = idcita;
        this.idcontacto = idcontacto;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public int getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(int idcontacto) {
        this.idcontacto = idcontacto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    
}
