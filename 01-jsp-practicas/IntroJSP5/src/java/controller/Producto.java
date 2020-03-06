package controller;

/**
 *
 * @author jessicaramsa
 */
public class Producto {
    private int clave;
    private String nombre;
    private Double precio;
    private int cantidad;
    
    public Producto() {
        clave = 0;
        nombre = "";
        precio = 0.0;
        cantidad = 0;
    }
    public Producto(int clave, String nombre,Double precio,int cant) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cant;
    }

    public void setClave(int c) {
        clave = c;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setPrecio(double p) {
        precio = p;
    }
    
    public void setCantidad(int cant) {
        cantidad = cant;
    }
    
    public int getClave() {
        return clave;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Double getPrecio() {
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}