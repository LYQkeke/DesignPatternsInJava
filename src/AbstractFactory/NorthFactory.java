package AbstractFactory;

import SimpleFactory.Fruit;

/**
 * Created by KEKE on 2019/5/9
 */
public class NorthFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
