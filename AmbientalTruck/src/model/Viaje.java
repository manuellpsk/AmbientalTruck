package model;

import java.util.Calendar;

public class Viaje {

    private int id_viaje;
    private Transporte transporte;
    private Calendar fecha;
    private float temperatura;
    private float presion;

    public Viaje() {
    }

    public Viaje(int id_viaje, Transporte transporte, Calendar fecha, float temperatura, float presion) {
        this.id_viaje = id_viaje;
        this.transporte = transporte;
        this.fecha = fecha;
        this.temperatura = temperatura;
        this.presion = presion;
    }

    public int getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(int id_viaje) {
        this.id_viaje = id_viaje;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    
}
