package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Datos;

public class Consulta {
    
    private Connection cn = null;
    private ArrayList<Datos> lista=new ArrayList<>();
    DataBaseConection con=null;
    public Consulta(){
        
    }
    
    public ArrayList<Datos> dataViajes(int id){
        try {
            lista.clear();
            con=new DataBaseConection().Conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT TIME(FECHA) AS FECHA,TEMPERATURA FROM VIAJE";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String tiempo=rs.getString("FECHA");
                String[] temp=tiempo.split(":");
                
                Datos dato = new Datos(Integer.parseInt(temp[0]),Integer.parseInt(temp[0]),Integer.parseInt(temp[0]),rs.getFloat("TEMPERATURA"));
                lista.add(dato);
            }
            if (lista.isEmpty()) {
                System.out.println("No hay registros");
            }
        } catch (SQLException e) {
            System.out.println("Error en database");
        } finally{
            return lista;
        }
    }
    
    public boolean validarUsuario(int usuario,String password){
        boolean f=false;
        try {
            con=new DataBaseConection().Conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM USUARIO WHERE ID_USUARIO='"+usuario+"' AND PASS='"+password+"'";
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                f=true;
            }
        } catch (SQLException e) {
            System.out.println("Error en database"+e.getMessage());
        } finally{
            return f;
        }
    }
}
