package model;
public class User {

    private String id_usuario;
    private String pass;
    private int id_tipo;
    private int rut;

    public User() {
    }

    public User(String id_usuario, String pass, int id_tipo, int rut) {
        this.id_usuario = id_usuario;
        this.pass = pass;
        this.id_tipo = id_tipo;
        this.rut = rut;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    
}
