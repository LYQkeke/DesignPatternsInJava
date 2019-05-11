package Builder;

/**
 * Created by KEKE on 2019/5/11
 */
public class GongyuBuilder extends HouseBuilder {
    @Override
    public void buildFloor() {
        this.getHouse().setFoor("公寓地板");
    }

    @Override
    public void buildWall() {
        this.getHouse().setWall("公寓墙面");
    }

    @Override
    public void buildCeil() {
        this.getHouse().setCeil("公寓天花板");
    }
}
