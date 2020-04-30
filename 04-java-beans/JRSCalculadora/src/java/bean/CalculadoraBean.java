package bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author jessicaramsa
 */
@Named(value = "calculadoraBean")
@Dependent
public class CalculadoraBean {

    private double firstNum;
    private double secondNum;
    private char operator = '+';
    private double result;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void calculate() {
        switch (this.operator) {
            case '+': {
                this.result = this.firstNum + this.secondNum;
                break;
            }
            case '-': {
                this.result = this.firstNum - this.secondNum;
                break;
            }
            case '*': {
                this.result = this.firstNum * this.secondNum;
                break;
            }
            case '/': {
                if (this.secondNum == 0) {
                    throw new RuntimeException("Dividend cannot be 0！");
                }
                this.result = this.firstNum / this.secondNum;
                break;
            }
            default:
                throw new RuntimeException("Sorry, the input operator is illegal!");
        }
    }
}
