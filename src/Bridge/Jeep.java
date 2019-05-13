package Bridge;

/**
 * Created by KEKE on 2019/5/13
 */
public class Jeep extends Car {
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("Jeep installing... " + this.getEngine().getType());
    }
}
