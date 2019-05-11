package Builder;

/**
 * Created by KEKE on 2019/5/11
 */
public class HouseDirector {

    public void buildHouse(HouseBuilder builder){
        builder.buildFloor();
        builder.buildWall();
        builder.buildCeil();
    }
}
