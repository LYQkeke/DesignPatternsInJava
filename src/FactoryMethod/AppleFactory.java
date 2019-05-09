package FactoryMethod;

import SimpleFactory.Apple;
import SimpleFactory.Fruit;

/**
 * Created by KEKE on 2019/5/9
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
