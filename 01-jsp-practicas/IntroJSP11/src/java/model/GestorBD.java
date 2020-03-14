package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jessicaramsa
 */
public class GestorBD {
    private Connection conexion = null;
    private Statement stm = null;
    private ResultSet videojuegoResultSet;
    private Integer clave;
    private String nombre, genero, plataforma, precio;
    private int resultUpdate = 0;

    public ArrayList<Videojuego> leerVideojuegos() {
        ArrayList<Videojuego> videojuego = new ArrayList<>();
        Videojuego videojuegoEncontrado;

        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            videojuegoResultSet = stm.executeQuery("SELECT * FROM videojuego;");

            if (!videojuegoResultSet.next()) {
                System.out.println("No se encontraron registros.");
                conexion.close();
                return null;
            } else {
                do {
                    clave = videojuegoResultSet.getInt("clave");
                    nombre = videojuegoResultSet.getString("nombre");
                    genero = videojuegoResultSet.getString("genero");
                    plataforma = videojuegoResultSet.getString("plataforma");
                    precio = videojuegoResultSet.getString("precio");
                    videojuegoEncontrado = new Videojuego(clave, nombre, genero, plataforma, precio);
                    videojuego.add(videojuegoEncontrado);
                } while(videojuegoResultSet.next());
                conexion.close();
                return videojuego;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return null;
        }
    }
    
    public boolean guardarVideojuego(Videojuego videojuegoNuevo) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("INSERT INTO videojuego VALUES("
                    + videojuegoNuevo.getClave() + ", "
                    + "'" + videojuegoNuevo.getNombre() + "', "
                    + "'" + videojuegoNuevo.getGenero() + "', "
                    + "'" + videojuegoNuevo.getPlataforma() + "', "
                    + "'" + videojuegoNuevo.getPrecio() + "');"
            );
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar el Videojuego.");
                return false;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return false;
        }
    }
    
    public boolean borrarVideojuego(Videojuego videojuegoABorrar) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("DELETE FROM videojuego WHERE("
                    + "clave = " + videojuegoABorrar.getClave()
                    + " AND nombre = '" + videojuegoABorrar.getNombre() + "');"
            );
            
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo borrar el Videojuego.");
                return false;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return false;
        }
    }
    
    public boolean localizaVideojuego(Integer clave, String nombre) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            videojuegoResultSet = stm.executeQuery("SELECT * FROM videojuego"
                    + " WHERE (clave = " + clave
                    + " AND nombre = '" + nombre + "');"
            );
            if (!videojuegoResultSet.next()) {
                System.out.println("No se encontraron registros.");
                conexion.close();
                return false;
            } else {
                conexion.close();
                return true;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return false;
        }
    }
    
    public Videojuego localizaVideojuegoCompleto(Integer clave, String nombre) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            videojuegoResultSet = stm.executeQuery("SELECT * FROM videojuego"
                    + " WHERE (clave = " + clave
                    + " AND nombre = '" + nombre + "');"
            );
            if (!videojuegoResultSet.next()) {
                System.out.println("No se encontraron registros.");
                conexion.close();
                return null;
            } else {
                Videojuego videojuegoNuevo = new Videojuego(
                    clave,
                    nombre,
                    videojuegoResultSet.getString("genero"),
                    videojuegoResultSet.getString("plataforma"),
                    videojuegoResultSet.getString("precio")
                );
                conexion.close();
                return videojuegoNuevo;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return null;
        }
    }
    
    public boolean modificarVideojuego(Videojuego videojuegoACambiar) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("UPDATE videojuego SET "
                    + "nombre = '" + videojuegoACambiar.getNombre() + "', "
                    + "genero = '" + videojuegoACambiar.getGenero() + "', "
                    + "plataforma = '" + videojuegoACambiar.getPlataforma() + "' "
                    + "precio = '" + videojuegoACambiar.getPrecio() + "' "
                    + "WHERE clave = " + videojuegoACambiar.getClave() + ";"
            );
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo modificar el Videojuego.");
                return false;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return false;
        }
    }
}