package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jessicaramsa
 */
public class ConectaBD {
    private Connection conexion = null;
    private String servidor = "localhost";
    private String database = "videojuegos";
    private String usuario = "root";
    private String password = "Cluster.8";
    private String url = "";

    public ConectaBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database;
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch(SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public Connection cerrarConexion() {
        try {
            conexion.close();
        } catch(SQLException sqle) {
            System.out.println(sqle);
        }
        conexion = null;
        return conexion;
    }
}