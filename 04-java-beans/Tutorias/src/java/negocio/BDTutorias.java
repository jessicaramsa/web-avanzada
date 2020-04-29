package negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jessicaramsa
 */
public final class BDTutorias {
    private Connection conexión;
    private Statement sentenciaSQL;
    private ResultSet cdr;

    public BDTutorias() throws ClassNotFoundException,
            SQLException, InstantiationException,
            IllegalAccessException {
        String controlador = "com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        conectar();
    }

    public void conectar() throws SQLException {
        String URL_bd
                = "jdbc:mysql://127.0.0.1:3306/db_tutorias";
        String usuario = "root";
        String contrasenia = "Cluster.8";
        conexión = DriverManager.getConnection(URL_bd, usuario, contrasenia);
        sentenciaSQL = conexión.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        System.out.println("\nConexión realizada con éxito.\n");
    }

    public void cerrarConexion() throws java.sql.SQLException {
        if (cdr != null) {
            cdr.close();
        }
        if (sentenciaSQL != null) {
            sentenciaSQL.close();
        }
        if (conexión != null) {
            conexión.close();
        }
    }

    public ResultSet obtenerTabla(String tabla) throws SQLException {
        cdr = sentenciaSQL.executeQuery("SELECT * FROM " + tabla);
        return cdr;
    }

    public ResultSet tutoriasDisponibles() throws SQLException {
        cdr = sentenciaSQL.executeQuery(
                "SELECT tutorias.id_tutoria, profesores.profesor, "
                + "tutorias.dia, tutorias.hora "
                + "FROM profesores, tutorias "
                + "WHERE profesores.id_profesor=tutorias.id_profesor "
                + "AND tutorias.id_tutoria NOT IN "
                + "(SELECT id_tutoria FROM citas)");
        return cdr;
    }

    public ResultSet citas() throws SQLException {
        cdr = sentenciaSQL.executeQuery("SELECT * FROM citas");
        return cdr;
    }

    public void ModificaCita(int id_tutoria, String alumno,
            String asunto) throws
            SQLException {
        sentenciaSQL.executeUpdate("UPDATE citas SET alumno ='" + alumno
                + "'  , asunto='" + asunto + "'WHERE id_tutoria = " + id_tutoria);
    }

    public void insertarEnCitas(int id_tutoria, String alumno, String asunto)
            throws SQLException {
        sentenciaSQL.executeUpdate("INSERT INTO citas"
                + " VALUES (" + id_tutoria + ", '" + alumno + "', '"
                + asunto + "')"
        );
    }

    public ResultSet tutorias() throws SQLException {
        cdr = sentenciaSQL.executeQuery("SELECT * FROM tutorias");
        return cdr;
    }

    public void ModificaTutoria(int id_tutoria, String alumno, String asunto) throws
            SQLException {
        sentenciaSQL.executeUpdate("UPDATE citas SET alumno ='" + alumno
                + "'  ,asunto='" + asunto + "' WHERE id_tutoria = " + id_tutoria);
    }

    public void insertarEnTutorias(int id_tutoria, String alumno, String asunto)
            throws SQLException {
        sentenciaSQL.executeUpdate("INSERT INTO citas"
                + " VALUES (" + id_tutoria + ", '" + alumno + "', '"
                + asunto + "')"
        );
    }

    public void borrarCitas(int id_tutorias) throws SQLException {
        sentenciaSQL.executeUpdate("DELETE FROM citas WHERE id_tutoria = " + id_tutorias);
    }

    public int obtenerIdProfesor(String nombre) throws SQLException {
        cdr = sentenciaSQL.executeQuery(
                "SELECT * FROM profesores"
                + " WHERE profesor = " + "'" + nombre + "'");
        if (cdr.isBeforeFirst()) {
            cdr.first();
            return cdr.getInt("id_profesor");
        } else {
            return -1;
        }
    }

    public int obtenerIdTutoria(int id_prof, String d, String h) throws SQLException {
        cdr = sentenciaSQL.executeQuery(
                "SELECT * FROM tutorias"
                + " WHERE id_profesor = " + id_prof
                + " AND dia = " + "'" + d + "'"
                + " AND hora = " + "'" + h + "'");
        if (cdr.isBeforeFirst()) {
            cdr.first();
            return cdr.getInt("id_tutoria");
        } else {
            return -1;
        }
    }

    public boolean noEstaReservada(int idT) throws SQLException {
        cdr = sentenciaSQL.executeQuery("SELECT id_tutoria FROM citas WHERE id_tutoria = " + idT);
        return !cdr.isBeforeFirst();
    }
}
