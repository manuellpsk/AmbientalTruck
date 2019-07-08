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
    
    public boolean validarUsuario(String usuario,String password){
        boolean f=false;
        try {
            con=new DataBaseConection().Conectar();
            cn=con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM AMBIENTAL.USUARIO WHERE ID_USUARIO='"+usuario+"' AND PASS='"+password+"'";
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
    //SELECT * FROM USUARIO WHERE ID_USUARIO='adm' AND PASS='123'
    
    public boolean registroUsuario(String id_user,String pass,int rut,String nombre,int rubro){
        boolean estado = false;
        try {
            con=new DataBaseConection().Conectar();
            cn=con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            //INGRESANDO EMPLEADO
            String query = "INSERT INTO AMBIENTAL.EMPLEADO VALUES("+rut+",'" +nombre+ "',null,null,null,2)";
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no inserto empleado");
            } else {
                System.out.println("Ingreso correcto empleado");
                //ingresando usuario
                Statement st2 = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                estado = true;
                String query2 = "INSERT INTO AMBIENTAL.USUARIO VALUES('"+id_user+"','" +pass+ "',"+rubro+","+rut+")";
                System.out.println(query2);
                int f2 = st2.executeUpdate(query2);
                if (f2 != 1) {
                    System.out.println("no inserto empleado");
                }else{
                    System.out.println("Ingreso usuario");
                }
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }finally{
            return estado;
        }
    }
}
