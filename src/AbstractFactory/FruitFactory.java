package AbstractFactory;

import SimpleFactory.Fruit;

/**
 * Created by KEKE on 2019/5/9
 */
public interface FruitFactory {

    Fruit getApple();

    Fruit getBanana();
}
