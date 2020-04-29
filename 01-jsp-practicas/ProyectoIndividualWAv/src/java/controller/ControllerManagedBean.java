package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.GestorBD;
import model.Videojuego;

/**
 *
 * @author jessicaramsa
 */
@ManagedBean
@SessionScoped
public class ControllerManagedBean {
    private Integer clave;
    private String nombre;
    private String genero;
    private String plataforma;
    private String precio;
    private GestorBD gestorBD;
    private static ArrayList<Videojuego> videojuegosList;
    
    public ControllerManagedBean() {
        gestorBD = new GestorBD();
        videojuegosList = gestorBD.leerVideojuegos();
    }

    public Integer getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getPrecio() {
        return precio;
    }

    public ArrayList<Videojuego> getVideojuegosList() {
        return videojuegosList;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public GestorBD getGestorBD() {
        return gestorBD;
    }

    public void setGestorBD(GestorBD gestorBD) {
        this.gestorBD = gestorBD;
    }

    public void setVideojuegosList(ArrayList<Videojuego> videojuegosList) {
        ControllerManagedBean.videojuegosList = videojuegosList;
    }
    
    public void pedirDatosVideojuego_aAgregar() {
        try {
            FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("agregar.xhtml");
        } catch(IOException ioe) {
            Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
    
    public void guardarVideojuego() {
        Videojuego videojuegoNuevo = new Videojuego(clave, nombre, genero, plataforma, precio);
        if (gestorBD.guardarVideojuego(videojuegoNuevo)) {
            try {
                videojuegosList = gestorBD.leerVideojuegos();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("index.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
    
    public void pedirDatosVideojuego_aBorrar() {
        try {
            FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("borrar.xhtml");
        } catch(IOException ioe) {
            Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
    
    public void borrarVideojuego() {
        Videojuego videojuegoABorrar = new Videojuego(clave, nombre, genero, plataforma, precio);
        if (gestorBD.borrarVideojuego(videojuegoABorrar)) {
            try {
                videojuegosList = gestorBD.leerVideojuegos();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("index.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
    
    public void pedirDatosVideojuego_aLocalizar() {
        try {
            FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("localizar.xhtml");
        } catch(IOException ioe) {
            Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
    
    public void localizarVideojuego() {
        if (gestorBD.localizaVideojuego(clave, nombre)) {
            try {
                Videojuego videojuegoNuevo = gestorBD.localizaVideojuegoCompleto(clave, nombre);
                genero = videojuegoNuevo.getGenero();
                plataforma = videojuegoNuevo.getPlataforma();
                precio = videojuegoNuevo.getPrecio();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("modificar.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        } else {
            try {
                videojuegosList = gestorBD.leerVideojuegos();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("error.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
    
    public void modificarVideojuego() {
        Videojuego videojuegoACambiar = new Videojuego(clave, nombre, genero, plataforma, precio);
        if (gestorBD.modificarVideojuego(videojuegoACambiar)) {
            try {
                videojuegosList = gestorBD.leerVideojuegos();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("index.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
}