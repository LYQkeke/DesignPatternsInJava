package Template;

/**
 * Created by KEKE on 2019/5/15
 */
public abstract class Game {

    abstract protected void initialize();

    abstract protected void startPlay();

    abstract protected void endPlay();

    // 模板方法
    public final void play(){
        // 初始化游戏
        initialize();
        // 开始游戏
        startPlay();
        // 结束游戏
        endPlay();
    }
}
