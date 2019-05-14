package Mediator;

/**
 * Created by KEKE on 2019/5/14
 */
public class Main {

    public static void main(String[] args) {
        Woman woman1 = new Woman("李冰冰",2);
        Woman woman2 = new Woman("范冰冰",3);
        Woman woman3 = new Woman("赵冰冰",4);
        Mediator mediator = new Mediator();
        mediator.register(woman1);
        mediator.register(woman2);
        mediator.register(woman3);
        Man man1 = new Man("王宝强",6);
        mediator.register(man1);
        mediator.getPartner(man1);
        mediator.getPartner(woman1);
    }
}
