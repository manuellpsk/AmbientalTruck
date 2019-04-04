package model;

import java.util.Calendar;

public class Viaje {

    private Transporte transporte;
    private Calendar tiempo;

    public Viaje() {
    }

    public Viaje(Transporte transporte, Calendar tiempo) {
        this.transporte = transporte;
        this.tiempo = tiempo;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Calendar getTiempo() {
        return tiempo;
    }

    public void setTiempo(Calendar tiempo) {
        this.tiempo = tiempo;
    }

    
}
