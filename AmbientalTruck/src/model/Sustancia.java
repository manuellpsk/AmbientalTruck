package model;
public class Sustancia {
    
    private String nombre;
    private float tempmax;
    private float presmax;
    private float tempmin;
    private float presmin;

    public Sustancia() {
    }

    public Sustancia(String nombre, float tempmax, float presmax, float tempmin, float presmin) {
        this.nombre = nombre;
        this.tempmax = tempmax;
        this.presmax = presmax;
        this.tempmin = tempmin;
        this.presmin = presmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTempmax() {
        return tempmax;
    }

    public void setTempmax(float tempmax) {
        this.tempmax = tempmax;
    }

    public float getPresmax() {
        return presmax;
    }

    public void setPresmax(float presmax) {
        this.presmax = presmax;
    }

    public float getTempmin() {
        return tempmin;
    }

    public void setTempmin(float tempmin) {
        this.tempmin = tempmin;
    }

    public float getPresmin() {
        return presmin;
    }

    public void setPresmin(float presmin) {
        this.presmin = presmin;
    }

    
    
}
