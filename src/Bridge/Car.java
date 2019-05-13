package Bridge;

/**
 * Created by KEKE on 2019/5/13
 */
public abstract class Car {

    // 持有一个Engine类的引用
    // 这就是一个桥 -- 桥接的关键所在
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void installEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
