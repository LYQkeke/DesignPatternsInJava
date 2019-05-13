package Bridge;

/**
 * Created by KEKE on 2019/5/13
 */
public class Main {

    public static void main(String[] args) {
        Car bus1 = new Bus(new Engine2000cc());
        bus1.installEngine();
        Car bus2 = new Bus(new Engine2200cc());
        bus2.installEngine();
        Car jeep1 = new Jeep(new Engine2000cc());
        jeep1.installEngine();
        Car jeep2 = new Jeep(new Engine2200cc());
        jeep2.installEngine();
    }
}
