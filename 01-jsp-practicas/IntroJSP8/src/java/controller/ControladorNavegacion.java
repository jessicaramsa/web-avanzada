package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Uroboros
 */
@ManagedBean(name = "navegador")
@RequestScoped
public class ControladorNavegacion implements Serializable {
    private AdministraVista administrador;

    public ControladorNavegacion() {
        // Crea una instancia de administrador
        this.administrador = new AdministraVista();
    }

    public void metodo1() {
        administrador.presentarInterfaz(1);
    }

    public void metodo2() {
        administrador.presentarInterfaz(2);
    }

    public void metodo3() {
        administrador.presentarInterfaz(3);
    }

    public void metodo4() {
        administrador.presentarInterfaz(4);
    }
}