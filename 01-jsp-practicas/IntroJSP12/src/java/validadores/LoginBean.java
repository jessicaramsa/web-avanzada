package validadores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jessicaramsa
 */
@ManagedBean(name="loginBean", eager=true)
@SessionScoped
public class LoginBean {
    String numeroCuenta;
    String nombre;

    public void enviar() {
        System.out.println(this.numeroCuenta + " - " + this.nombre);
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
