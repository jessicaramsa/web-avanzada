package validadores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jessicaramsa
 */
@ManagedBean(name="registro", eager=true)
@SessionScoped
public class Registro {
    String nombre;
    int num1;
    int num2;
    
    public void enviar() {
        System.out.println(this.nombre + " - " + (this.num1 + this.num2));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
