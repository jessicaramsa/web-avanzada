package app.pruebas;

import app.modelo.Alumno;
import app.persistencia.AlumnoBD;
import java.sql.SQLException;

/**
 *
 * @author jessicaramsa
 */
public class TestInsertarAlumno {
    public static void main(String[] args) {
        Alumno a = new Alumno();
        AlumnoBD aBD = new AlumnoBD();
        int estado = 0;
        
        a.setNo_control(16240681);
        a.setNombre("Jessica");
        a.setSemestre(8);
        
        try {
            aBD.abrir();
            estado = aBD.insertar(a);
            aBD.cerrar();
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.exit(1);
        }
        
        if (estado == 0)
            System.out.println("No se pudo insertar");
        else
            System.out.println("Inserción exitosa");
    }
}
