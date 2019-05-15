package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEKE on 2019/5/15
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
