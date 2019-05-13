package Facade;

/**
 * Created by KEKE on 2019/5/13
 *
 * 外观模式
 */
public class Facade {

    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade(){
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }

    public void doABC(){
        systemA.dosomething();
        systemB.dosomething();
        systemC.dosomething();
    }

    public void doAB(){
        systemA.dosomething();
        systemB.dosomething();
    }

    public void doBC(){
        systemB.dosomething();
        systemC.dosomething();
    }
}
