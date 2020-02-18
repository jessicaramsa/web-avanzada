package clases;

/**
 *
 * @author jessicaramsa
 */
public class ResuelveEc {
    private Double a;
    private Double b;
    private Double c;
    private Double discr;

    public ResuelveEc(String a1, String b1, String c2) {
        a = Double.parseDouble(a1);
        b = Double.parseDouble(b1);
        c = Double.parseDouble(c2);
        discr = (Math.pow(b, 2) - (4 * a * c));
    }

    public String raiz1() {
        Double raiz;
        Double real, imaginaria;
        if (discr >= 0) {
            raiz = (-b + Math.sqrt(discr)) / (2 * a);
            return String.valueOf(raiz);
        } else {
            real = b / (2 * a);
            imaginaria = (Math.sqrt(-discr)) / (2 * a);
            return (real + " + " + imaginaria + "i"); }
    }
    
    public String raiz2() {
        Double raiz; Double real, imaginaria;
        if (discr >= 0) {
            raiz = (-b - Math.sqrt(discr) ) /( 2 * a);
            return String.valueOf(raiz);
        } else {
            real= b/(2 * a);
            imaginaria = (Math.sqrt(-discr)) / (2 * a);
            return (real + " - " + imaginaria + "i");
        }
    }
}
