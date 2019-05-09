package FactoryMethod;

import SimpleFactory.Banana;
import SimpleFactory.Fruit;

/**
 * Created by KEKE on 2019/5/9
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
