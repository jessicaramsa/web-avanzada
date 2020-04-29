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
    private ResultSet ueaResultSet;
    private Integer clave, trimestre;
    private String nombre, requisito;
    private int resultUpdate = 0;

    public ArrayList<Uea> leerUeas() {
        ArrayList<Uea> ueas = new ArrayList<>();
        Uea ueaHallada;

        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            ueaResultSet = stm.executeQuery("SELECT * FROM ueas;");

            if (!ueaResultSet.next()) {
                System.out.println("No se encontraron registros.");
                conexion.close();
                return null;
            } else {
                do {
                    clave = ueaResultSet.getInt("clave");
                    nombre = ueaResultSet.getString("nombre");
                    trimestre = ueaResultSet.getInt("trimestre");
                    requisito = ueaResultSet.getString("requiere");
                    ueaHallada = new Uea(clave, nombre, trimestre, requisito);
                    ueas.add(ueaHallada);
                } while(ueaResultSet.next());
                conexion.close();
                return ueas;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return null;
        }
    }
    
    public boolean guardarUea(Uea ueaNueva) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("INSERT INTO ueas VALUES("
                    + ueaNueva.getClave() + ", "
                    + "'"+ ueaNueva.getNombre() + "', "
                    + ueaNueva.getTrimestre() + ", "
                    + "'"+ ueaNueva.getRequisito() + "');"
            );
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar la UEA.");
                return false;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return false;
        }
    }
    
    public boolean borrarUea(Uea ueaABorrar) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("DELETE FROM ueas WHERE("
                    + "clave = " + ueaABorrar.getClave()
                    + " AND nombre = '" + ueaABorrar.getNombre() + "');"
            );
            
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo borrar la UEA.");
                return false;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return false;
        }
    }
    
    public boolean localizaUEA(Integer clave, String nombre) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            ueaResultSet = stm.executeQuery("SELECT * FROM ueas"
                    + " WHERE (clave = " + clave
                    + " AND nombre = '" + nombre + "');"
            );
            if (!ueaResultSet.next()) {
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
    
    public Uea localizaUEACompleta(Integer clave, String nombre) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            ueaResultSet = stm.executeQuery("SELECT * FROM ueas"
                    + " WHERE (clave = " + clave
                    + " AND nombre = '" + nombre + "');"
            );
            if (!ueaResultSet.next()) {
                System.out.println("No se encontraron registros.");
                conexion.close();
                return null;
            } else {
                Uea ueaNueva = new Uea(clave, nombre,
                    ueaResultSet.getInt("trimestre"),
                    ueaResultSet.getString("requiere")
                );
                conexion.close();
                return ueaNueva;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return null;
        }
    }
    
    public boolean modificarUea(Uea ueaACambiar) {
        try {
            ConectaBD conectaBD = new ConectaBD();
            conexion = conectaBD.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("UPDATE ueas SET "
                    + "nombre = '" + ueaACambiar.getNombre() + "', "
                    + "trimestre = " + ueaACambiar.getTrimestre() + ", "
                    + "requiere = '" + ueaACambiar.getRequisito() + "' "
                    + "WHERE clave = " + ueaACambiar.getClave() + ";"
            );
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo modificar la UEA.");
                return false;
            }
        } catch(SQLException sqle) {
            System.out.println("Error en la base de datos.");
            sqle.printStackTrace();
            return false;
        }
    }
}