package TestFactory;

/**
 * Created by KEKE on 2019/5/9
 */
public abstract class Operation {

    private double num1;

    private double num2;

    abstract public double getResult();

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
