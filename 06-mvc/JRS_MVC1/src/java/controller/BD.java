package controller;

/**
 *
 * @author jessicaramsa
 */
public class BD {
    private String atributos[];

    public BD() {
        atributos = new String[2];
        atributos[0] = "Jéssica";
        atributos[1] = "22";
    }
    
    public String getParametro(int valor) {
        return atributos[valor];
    }
}
