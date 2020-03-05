package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Uroboros
 */
@ManagedBean
@RequestScoped
public class Direccion {
    private String calle;
    private int numero;
    private int codigoPostal;
    
    public Direccion() {}

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }
}