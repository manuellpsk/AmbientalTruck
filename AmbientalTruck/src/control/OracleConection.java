package control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConection {
    private Connection conexion;
    
     public Connection getConexion() {
        return conexion;
    }
    
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public OracleConection Conectar()
    {
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion= DriverManager.getConnection(BaseDeDatos,"system","123");
        if(conexion!=null)
        {
        System.out.println("Conexion exitosa a esquema HR");
        }
        else{System.out.println("Conexion fallida");}
        }
        catch(ClassNotFoundException | SQLException e)
        {e.printStackTrace();}
      
        return this;
    }
}
