package Facade;

/**
 * Created by KEKE on 2019/5/13
 */
public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();
        client1(facade);
        System.out.println();
        client2(facade);
        System.out.println();
        client3(facade);

    }

    private static void client1(Facade facade){
        facade.doABC();
    }

    private static void client2(Facade facade){
        facade.doAB();
    }

    private static void client3(Facade facade){
        facade.doBC();
    }
}
