package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Uroboros
 */
@ManagedBean(name="formulario")
@RequestScoped
public class Formulario implements Serializable {
    Boolean recibirInfo;
    String[] idiomas;
    String[] lenguajes;
    String genero;
    String sistema;

    public Formulario() {}

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public Boolean getRecibirInfo() {
        return recibirInfo;
    }

    public void setRecibirInfo(Boolean recibirInfo) {
        this.recibirInfo = recibirInfo;
    }
}