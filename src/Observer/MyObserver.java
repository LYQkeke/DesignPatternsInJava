package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by KEKE on 2019/5/12
 */
public class MyObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("对象发生变化");
    }
}
