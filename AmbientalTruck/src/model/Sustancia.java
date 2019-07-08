package model;
public class Sustancia {
    
    private int id_sus;
    private String nombre;
    private float temp_min;
    private float temp_max;
    private float presion_min;
    private float presion_max;

    public Sustancia() {
    }

    public Sustancia(int id_sus, String nombre, float temp_min, float temp_max, float presion_min, float presion_max) {
        this.id_sus = id_sus;
        this.nombre = nombre;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.presion_min = presion_min;
        this.presion_max = presion_max;
    }

    public int getId_sus() {
        return id_sus;
    }

    public void setId_sus(int id_sus) {
        this.id_sus = id_sus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public float getPresion_min() {
        return presion_min;
    }

    public void setPresion_min(float presion_min) {
        this.presion_min = presion_min;
    }

    public float getPresion_max() {
        return presion_max;
    }

    public void setPresion_max(float presion_max) {
        this.presion_max = presion_max;
    }

    
    
}
