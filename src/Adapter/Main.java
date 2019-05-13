package Adapter;

/**
 * Created by KEKE on 2019/5/13
 */
public class Main {

    public static void main(String[] args) {
        Runner runner = new Runner(new OldDisplayerAdapter());
        runner.start();
    }
}
