package app.pruebas;

import app.modelo.Alumno;
import app.persistencia.AlumnoBD;
import java.sql.SQLException;

/**
 *
 * @author jessicaramsa
 */
public class TestBuscarAlumno {
    public static void main(String[] args) {
        Alumno a = new Alumno();
        AlumnoBD aBD = new AlumnoBD();
        int no_control = 16240681;
        
        try {
            aBD.abrir();
            a = aBD.buscar(no_control);
            aBD.cerrar();
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.exit(1);
        }
        
        if (a == null)
            System.out.println("Alumno inexistente");
        else {
            System.out.println("no_control => " + a.getNo_control());
            System.out.println("nombre => " + a.getNombre());
            System.out.println("semestre => " + a.getSemestre());
        }
    }
}
