package model;

/**
 *
 * @author Uroboros
 */
public class Interfaces {
    private String interfaces[];

    public Interfaces() {
        this.interfaces = new String[10];
        this.interfaces[1] = "index.xhtml";
        this.interfaces[2] = "sonrisa.xhtml";
        this.interfaces[3] = "muestraElementosInterfaz.xhtml";
        this.interfaces[4] = "unFacelet.xhtml";
    }

    public String obtenerNombreInterfaz(int numeroInterfaz) {
        return this.interfaces[numeroInterfaz];
    }
}