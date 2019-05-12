package Decorator;

/**
 * Created by KEKE on 2019/5/11
 */
public abstract class CarDecorator extends Car{

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    abstract public void show();
}
