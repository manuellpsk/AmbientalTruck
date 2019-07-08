package model;
public class Transporte {

    private int id_transporte;
    private Empleado empleado;
    private Camion camion;
    private String destino;

    public Transporte() {
    }

    public Transporte(int id_transporte, Empleado empleado, Camion camion, String destino) {
        this.id_transporte = id_transporte;
        this.empleado = empleado;
        this.camion = camion;
        this.destino = destino;
    }

    public int getId_transporte() {
        return id_transporte;
    }

    public void setId_transporte(int id_transporte) {
        this.id_transporte = id_transporte;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
}
