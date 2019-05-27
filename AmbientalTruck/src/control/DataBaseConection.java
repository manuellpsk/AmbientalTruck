package control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConection {
    private Connection conexion;
    
     public Connection getConexion() {
        return conexion;
    }
    
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public DataBaseConection Conectar()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String BaseDeDatos = "jdbc:mysql://localhost:3306/ti";
        conexion= DriverManager.getConnection(BaseDeDatos,"root","");
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
