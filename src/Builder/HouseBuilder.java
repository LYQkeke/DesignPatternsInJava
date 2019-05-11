package Builder;

/**
 * Created by KEKE on 2019/5/11
 */
public abstract class HouseBuilder {

    private House house = new House();

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public abstract void buildFloor();

    public abstract void buildWall();

    public abstract void buildCeil();

}
