package Decorator;

/**
 * Created by KEKE on 2019/5/11
 */
public class FlyCarDecorator extends CarDecorator{

    public FlyCarDecorator(Car car) {
        super(car);
    }

    public FlyCarDecorator(){
        super(new Car());
    }

    @Override
    public void show() {
        getCar().show();
        fly();
    }

    public void fly(){
        System.out.println("flying...");
    }
}
