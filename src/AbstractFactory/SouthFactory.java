package AbstractFactory;

import SimpleFactory.Fruit;

/**
 * Created by KEKE on 2019/5/9
 */
public class SouthFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
