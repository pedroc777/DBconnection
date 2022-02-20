package controlador;

import java.sql.*;

public class Conexion {
	public Conexion() {
    }
    
    public static Connection init(){
        Connection con = null;
        
        String host = "****";
        String bd = "****";
        String password = "****";
        String usuario = "****";
        String url = "jdbc:mysql://" + host + "/" + bd + "?user=" + usuario + "&password=" + password;
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        
        return con;
    }
}
