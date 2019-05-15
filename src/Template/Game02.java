package Template;

/**
 * Created by KEKE on 2019/5/15
 */
public class Game02 extends Game {
    @Override
    public void initialize() {
        System.out.println("Game2 initialized");
    }

    @Override
    public void startPlay() {
        System.out.println("Game2 Start");
    }

    @Override
    public void endPlay() {
        System.out.println("Game2 End");
    }
}
