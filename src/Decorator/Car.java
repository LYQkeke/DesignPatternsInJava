package Decorator;

/**
 * Created by KEKE on 2019/5/11
 */
public class Car {

    public void run(){
        System.out.println("running...");
    }

    public void show(){
        this.run();
    }
}
