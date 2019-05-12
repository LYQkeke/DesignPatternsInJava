package Decorator;

/**
 * Created by KEKE on 2019/5/11
 */
public class Main {

    public static void main(String[] args) {
        SwimCarDecorator car1 = new SwimCarDecorator();
        car1.show();

        System.out.println();

        FlyCarDecorator car2 = new FlyCarDecorator();
        car2.show();

        System.out.println();

        Car car3 = new FlyCarDecorator(new SwimCarDecorator());
        car3.show();
    }
}
