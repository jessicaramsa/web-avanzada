package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBD {
    Connection conn = null;
    Statement stm = null;
    ResultSet usuarioResultSet;
    Usuario usuarioHallado;
    String cuent, nom, passw, mail;

    public boolean registrar(String cuenta, String nombre, String clave, String mail) {
        int resultUpdate = 0;
        try {
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate(
                    "INSERT INTO usuarios VALUES('" + cuenta + "','" + nombre + "','" + clave + "','" + mail + "');");
            if (resultUpdate != 0) {
                ConectaBD.cerrar();
                return true;
            } else {
                ConectaBD.cerrar();
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public Usuario consultar(String cuenta, String clave) {
        try {
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            usuarioResultSet = stm
                    .executeQuery("SELECT * FROM usuarios WHERE cuenta='" + cuenta + "' and clave='" + clave + "';");
            if (!usuarioResultSet.next()) {
                System.out.println("No se encontro el registro");
                ConectaBD.cerrar();
                return null;
            } else {
                System.out.println("Se encontró el registro");
                cuent = usuarioResultSet.getString("cuenta");
                nom = usuarioResultSet.getString("nombre");
                passw = usuarioResultSet.getString("clave");
                mail = usuarioResultSet.getString("mail");
                usuarioHallado = new Usuario(cuent, nom, passw, mail);
                ConectaBD.cerrar();
                return usuarioHallado;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return null;
        }
    }

    public boolean borrar(String cuenta, String clave) {
        int resultUpdate = 0;
        try {
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            resultUpdate = stm
                    .executeUpdate("DELETE FROM usuarios WHERE(cuenta='" + cuenta + "'and clave='" + clave + "');");
            if (resultUpdate != 0) {
                ConectaBD.cerrar();
                return true;
            } else {
                ConectaBD.cerrar();
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Usuario> leeTodos() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            usuarioResultSet = stm.executeQuery("SELECT * FROM usuarios;");
            if (!usuarioResultSet.next()) {
                System.out.println("No se encontraron registros");
                ConectaBD.cerrar();
                return null;
            } else {
                do {
                    cuent = usuarioResultSet.getString("cuenta");
                    nom = usuarioResultSet.getString("nombre");
                    passw = usuarioResultSet.getString("clave");
                    mail = usuarioResultSet.getString("mail");
                    usuarioHallado = new Usuario(cuent, nom, passw, mail);
                    usuarios.add(usuarioHallado);
                } while (usuarioResultSet.next());
                ConectaBD.cerrar();
                return usuarios;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return null;
        }
    }
}