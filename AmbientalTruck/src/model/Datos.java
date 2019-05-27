package model;
public class Datos {

    private int hora;
    private int minuto;
    private int segudo;
    private float temperatura;

    public Datos(int hora, int minuto, int segudo, float temperatura) {
        
        this.hora = hora;
        this.minuto = minuto;
        this.segudo = segudo;
        this.temperatura = temperatura;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegudo() {
        return segudo;
    }

    public void setSegudo(int segudo) {
        this.segudo = segudo;
    }

    public float getPresion() {
        return temperatura;
    }

    public void setPresion(float temperatura) {
        this.temperatura = temperatura;
    }
    
    
    
}
