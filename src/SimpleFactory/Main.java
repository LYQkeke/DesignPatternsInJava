package SimpleFactory;

/**
 * Created by KEKE on 2019/5/9
 */
public class Main {

    public static void main(String[] args) {
        // 实例化 用到了多态
//        Fruit apple = new Apple();
//        Fruit banana = new Banana();
//        apple.get();
//        banana.get();

        Fruit apple = FruitFactory.getApple();
        Fruit banana = FruitFactory.getBanana();
        apple.get();
        banana.get();

    }
}
