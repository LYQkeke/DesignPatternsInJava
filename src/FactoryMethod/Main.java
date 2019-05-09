package FactoryMethod;

import SimpleFactory.Fruit;

/**
 * Created by KEKE on 2019/5/9
 */
public class Main {


    public static void main(String[] args) {

        System.out.println("--工厂方法模式--");

        FruitFactory f1 = new AppleFactory();
        Fruit apple = f1.getFruit();
        apple.get();

        FruitFactory f2 = new BananaFactory();
        Fruit banana = f2.getFruit();
        banana.get();
    }
}
