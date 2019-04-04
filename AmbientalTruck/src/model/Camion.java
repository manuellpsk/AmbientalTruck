package model;
public class Camion {

    private String patente;
    private int tipo_sustancia;
    private float km;

    public Camion() {
    }

    public Camion(String patente, int tipo_sustancia, float km) {
        this.patente = patente;
        this.tipo_sustancia = tipo_sustancia;
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getTipo_sustancia() {
        return tipo_sustancia;
    }

    public void setTipo_sustancia(int tipo_sustancia) {
        this.tipo_sustancia = tipo_sustancia;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }
    
    
    
    
}
