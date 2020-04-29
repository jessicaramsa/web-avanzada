package validadores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jessicaramsa
 */
@ManagedBean(name="inicio", eager=true)
@SessionScoped
public class Inicio {
    int num1;
    int num2;
    int num3;
    int sumar = num1 + num2 + num3;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int sumar() {
        return sumar;
    }

    public void sumar(int num1, int num2, int num3) {
        this.sumar = num1 + num2 + num3;
    }
}
