package Clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private Conexion(){

    }

    private static Connection conexion;
    private static Conexion instancia;

    public static final String URL = "jdbc:mysql://localhost/bd_registros1";
    public static final String USER = "root";
    public static final String PASS = "";

    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USER,PASS);
            return conexion;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        return conexion;
    }

    public void cerrarConexion() throws SQLException {
        try {
            conexion.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
            conexion.close();
        } finally {
            conexion.close();
        }
    }

    public static Conexion getInstancia(){
        if (instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }
    
}
