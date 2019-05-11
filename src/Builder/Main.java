package Builder;

/**
 * Created by KEKE on 2019/5/11
 */
public class Main {

    public static void main(String[] args) {

        // 客户自己直接建房子
        House house = new House();
//        house.setFoor("地板");
//        house.setWall("墙面");
//        house.setCeil("天花板");

        // 设计师指导工程队来做
        // 设计师
        HouseDirector houseDirector = new HouseDirector();
        // 工程队
//        HouseBuilder builder = new PingfangBuilder();
        HouseBuilder builder = new GongyuBuilder();
        houseDirector.buildHouse(builder);
        house = builder.getHouse();

        System.out.println(house.getFoor());
        System.out.println(house.getWall());
        System.out.println(house.getCeil());

    }
}
