package model;

/**
 *
 * @author Uroboros
 */
public class Usuario {
    private String cuenta;
    private String nombre;
    private String clave;
    private String mail;
    
    public Usuario(String cuenta, String nombre, String clave, String mail) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.clave = clave;
        this.mail = mail;
    }
    
    public String getCuenta() {
        return cuenta;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getClave() {
        return clave;
    }
    
    public String getMail() {
        return mail;
    }
}
