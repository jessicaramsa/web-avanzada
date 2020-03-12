package model;

/**
 *
 * @author jessicaramsa
 */
public class Uea {
    private Integer clave;
    private String nombre;
    private Integer trimestre;
    private String requisito;
    
    public Uea(Integer clave, String nombre, Integer trimestre, String requisito) {
        this.clave = clave;
        this.nombre = nombre;
        this.trimestre = trimestre;
        this.requisito = requisito;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }
}