package app.persistencia;

import app.modelo.Alumno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jessicaramsa
 */
public class AlumnoBD {
    private String url = "jdbc:derby://localhost:1527/cap6";
    private String driver = "org.apache.derby.jdbc.ClientDriver";
    private String user = "root";
    private String contrasena = "Cluster.8";
    private Connection conexion;
    
    public void abrir() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conexion = DriverManager.getConnection(url, user, contrasena);
    }
    
    public void cerrar() throws SQLException {
        conexion.close();
    }
    
    public Alumno buscar(int no_control) throws SQLException {
        Alumno a = null;
        Statement smt;
        ResultSet rs;
        
        String query = "SELECT * FROM ALUMNO WHERE NO_CONTROL = " + no_control;
        smt = conexion.createStatement();
        rs = smt.executeQuery(query);
        
        while (rs.next()) {
            a = new Alumno();
            a.setNo_control(Integer.parseInt(rs.getString("NO_CONTROL")));
            a.setNombre(rs.getString("NOMBRE"));
            a.setSemestre(Integer.parseInt(rs.getString("SEMESTRE")));
        }
        return a;
    }
    
    public int insertar(Alumno a) throws SQLException {
        int no_control = a.getNo_control();
        String nombre = a.getNombre();
        int semestre = a.getSemestre();
        
        String query = "INSERT INTO ALUMNO VALUES("
                + no_control + ", '" + nombre + "', " + semestre + ")";
        
        Statement smt = conexion.createStatement();
        return smt.executeUpdate(query);
    }
    
    public int eliminar(int no_control) throws SQLException {
        Statement smt;
        String query = "DELETE FROM ALUMNO WHERE NO_CONTROL = " + no_control;
        smt = conexion.createStatement();
        return smt.executeUpdate(query);
    }
    
    public int modificar(Alumno a) throws SQLException {
        int no_control = a.getNo_control();
        String nombre = a.getNombre();
        int semestre = a.getSemestre();
        
        String query = "UPDATE ALUMNO SET NO_CONTROL = " + no_control + ", "
                + "NOMBRE = '" + nombre + "', "
                + "SEMESTRE = " + semestre
                + "WHERE NO_CONTROL = " + no_control;
        Statement smt = conexion.createStatement();
        return smt.executeUpdate(query);
    }
    
    public ArrayList<Alumno> listar() throws SQLException {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Alumno a = null;
        Statement smt;
        ResultSet rs;
        
        String query = "SELECT * FROM ALUMNO";
        smt = conexion.createStatement();
        rs = smt.executeQuery(query);
        
        while (rs.next()) {
            a = new Alumno();
            a.setNo_control(Integer.parseInt(rs.getString("NO_CONTROL")));
            a.setNombre(rs.getString("NOMBRE"));
            a.setSemestre(Integer.parseInt(rs.getString("SEMESTRE")));
            listaAlumnos.add(a);
        }
        return listaAlumnos;
    }
}
