package Bridge;

/**
 * Created by KEKE on 2019/5/13
 */
public class Bus extends Car{
    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("Bus isntalling... " + this.getEngine().getType());
    }
}
