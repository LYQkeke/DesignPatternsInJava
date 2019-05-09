package SimpleFactory;

/**
 * Created by KEKE on 2019/5/9
 */
public class FruitFactory {

    /**
     * 静态方法
     * 获得Apple类的实例
     * @return
     */
    public static Fruit getApple(){
        return new Apple();
    }

    /**
     * 静态方法
     * 获得Banana类的实例
     * @return
     */
    public static Fruit getBanana(){
        return new Banana();
    }
}
