package Builder;

/**
 * Created by KEKE on 2019/5/11
 */
public class PingfangBuilder extends HouseBuilder {

    @Override
    public void buildFloor() {
        this.getHouse().setFoor("平房地板");
    }

    @Override
    public void buildWall() {
        this.getHouse().setWall("平房墙面");
    }

    @Override
    public void buildCeil() {
        this.getHouse().setCeil("平房天花板");
    }
}
