package negocio;

/**
 *
 * @author jessicaramsa
 */
public class Calcular {
    private final Double sDiario;
    private final Double dTrabajo;
    private Double Stotal;

    public Calcular(String sueldoDia, String diasTrab) {
        sDiario = Double.parseDouble(sueldoDia);
        dTrabajo = Double.parseDouble(diasTrab);
    }

    public void sueldototal() {
        Stotal = dTrabajo * sDiario;
    }

    public Double getSueldo() {
        return Stotal;
    }
}