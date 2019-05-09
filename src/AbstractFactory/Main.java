package AbstractFactory;

/**
 * Created by KEKE on 2019/5/9
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("--抽象工厂方法--");

        FruitFactory nf = new NorthFactory();
        nf.getApple().get();
        nf.getBanana().get();

        FruitFactory sf = new SouthFactory();
        sf.getApple().get();
        sf.getBanana().get();
    }
}
