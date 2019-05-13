package Adapter;

/**
 * Created by KEKE on 2019/5/13
 *
 * 利用Adapter来对 OldDisplayer 进行适配
 */
public class OldDisplayerAdapter implements Displayer {

    private OldDisplayer displayer = new OldDisplayer();

    @Override
    public void display() {
        displayer.show();
    }
}
