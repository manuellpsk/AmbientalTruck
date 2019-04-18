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
    OracleConection con=null;
    public Consulta(){
        
    }
    
    public ArrayList<Datos> dataViajes(int id){
        try {
            lista.clear();
            con=new OracleConection().Conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT ID_VIAJE,TO_CHAR (FECHA, 'HH24:MI:SS') AS TIEMPO,PRESION,ID_TRANSPORTE FROM PRUEBAS.VIAJE WHERE ID_TRANSPORTE="+id;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String tiempo=rs.getString("TIEMPO");
                String[] temp=tiempo.split(":");
                
                Datos dato = new Datos(Integer.parseInt(temp[0]),Integer.parseInt(temp[0]),Integer.parseInt(temp[0]),rs.getFloat("PRESION"));
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
            con=new OracleConection().Conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM PRUEBAS.USUARIO WHERE ID_USUARIO='"+usuario+"' AND PASS='"+password+"'";
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
