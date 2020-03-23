package app.dominio;

/**
 *
 * @author jessicaramsa
 */
public class Registro {
    private int noSerie;
    private String marca;
    private String modelo;
    private String color;
    private String maestro;
    
    public Registro(int noSerie, String marca, String modelo, String color, String maestro) {
        this.noSerie = noSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.maestro = maestro;
    }

    public int getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(int noSerie) {
        this.noSerie = noSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }
}