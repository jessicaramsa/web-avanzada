package controller;

import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Uroboros
 */
@ManagedBean
@RequestScoped
public class EjemploBean {
    private String atributo1;
    private Integer atributo2;
    private Direccion atributo3;

    public EjemploBean() {}
    
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }
    
    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo2(Integer atributo2) {
        this.atributo2 = atributo2;
    }

    public Integer getAtributo2() {
        return atributo2;
    }

    public void setAtributo3(Direccion atributo3) {
        this.atributo3 = atributo3;
    }

    public Direccion getAtributo3() {
        return atributo3;
    }
}