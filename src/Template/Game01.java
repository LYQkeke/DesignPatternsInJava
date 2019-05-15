package Template;

/**
 * Created by KEKE on 2019/5/15
 */
public class Game01 extends Game {
    @Override
    public void initialize() {
        System.out.println("Game1 initialized");
    }

    @Override
    public void startPlay() {
        System.out.println("Game1 Start");
    }

    @Override
    public void endPlay() {
        System.out.println("Game1 End");
    }
}
