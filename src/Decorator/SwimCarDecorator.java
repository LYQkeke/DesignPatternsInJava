package Decorator;

/**
 * Created by KEKE on 2019/5/11
 */
public class SwimCarDecorator extends CarDecorator {

    public SwimCarDecorator(Car car) {
        super(car);
    }

    public SwimCarDecorator(){
        super(new Car());
    }

    @Override
    public void show() {
        getCar().show();
        swim();
    }

    public void swim(){
        System.out.println("swimming...");
    }
}
