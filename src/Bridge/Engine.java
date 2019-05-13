package Bridge;

/**
 * Created by KEKE on 2019/5/13
 */
public abstract class Engine {

    private String type;

    public Engine(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
