package controller;

import java.io.IOException;

/**
 *
 * @author Uroboros
 */
public class AdministraVista {
    private Interfaces catalogoInterfaces;

    public void presentarInterfaz(int interfaceId) {
        try {
            Interfaces listaInterfaces = new Interfaces();
            FacesContext.getCurrentInstance().getExternalContext().redirect(listaInterfaces.obtenerNombreInterfaz(interfaceId));
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}