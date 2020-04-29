package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.GestorBD;
import model.Uea;

/**
 *
 * @author jessicaramsa
 */
@ManagedBean
@SessionScoped
public class ControllerManagedBean {
    private Integer clave;
    private String nombre;
    private Integer trimestre;
    private String requisito;
    private GestorBD gestorBD;
    private static ArrayList<Uea> ueasList;
    
    public ControllerManagedBean() {
        gestorBD = new GestorBD();
        ueasList = gestorBD.leerUeas();
    }

    public Integer getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTrimestre() {
        return trimestre;
    }

    public String getRequisito() {
        return requisito;
    }

    public ArrayList<Uea> getUeasList() {
        return ueasList;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public void setUeasList(ArrayList<Uea> ueasList) {
        ControllerManagedBean.ueasList = ueasList;
    }
    
    public void pedirDatosUEA_aAgregar() {
        try {
            FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("agregar_UEA.xhtml");
        } catch(IOException ioe) {
            Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
    
    public void guardarUEA() {
        Uea ueaNueva = new Uea(clave, nombre, trimestre, requisito);
        if (gestorBD.guardarUea(ueaNueva)) {
            try {
                ueasList = gestorBD.leerUeas();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("index.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
    
    public void pedirDatosUEA_aBorrar() {
        try {
            FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("borrar_UEA.xhtml");
        } catch(IOException ioe) {
            Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
    
    public void borrarUEA() {
        Uea ueaABorrar = new Uea(clave, nombre, trimestre, requisito);
        if (gestorBD.borrarUea(ueaABorrar)) {
            try {
                ueasList = gestorBD.leerUeas();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("index.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
    
    public void pedirDatosUEA_aLocalizar() {
        try {
            FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("localizar_UEA.xhtml");
        } catch(IOException ioe) {
            Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
    
    public void localizarUEA() {
        if (gestorBD.localizaUEA(clave, nombre)) {
            try {
                Uea ueaNueva = gestorBD.localizaUEACompleta(clave, nombre);
                trimestre = ueaNueva.getTrimestre();
                requisito = ueaNueva.getRequisito();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("modificar_UEA.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        } else {
            try {
                ueasList = gestorBD.leerUeas();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("error.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
    
    public void modificarUEA() {
        Uea ueaACambiar = new Uea(clave, nombre, trimestre, requisito);
        if (gestorBD.modificarUea(ueaACambiar)) {
            try {
                ueasList = gestorBD.leerUeas();
                FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect("index.xhtml");
            } catch(IOException ioe) {
                Logger.getLogger(ControllerManagedBean.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }
}