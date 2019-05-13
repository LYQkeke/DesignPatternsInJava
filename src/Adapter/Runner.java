package Adapter;

/**
 * Created by KEKE on 2019/5/13
 *
 * Runner只能使用Displayer的实例来进行构造
 */
public class Runner {

    private Displayer displayer;

    public Runner(Displayer displayer){
        this.displayer = displayer;
    }

    public void start(){
        displayer.display();
    }
}
