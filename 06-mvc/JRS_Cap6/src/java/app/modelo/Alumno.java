package app.modelo;

/**
 *
 * @author jessicaramsa
 */
public class Alumno {
    int no_control;
    String nombre;
    int semestre;
    
    public Alumno () {}

    public int getNo_control() {
        return no_control;
    }

    public void setNo_control(int no_control) {
        this.no_control = no_control;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
