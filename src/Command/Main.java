package Command;

/**
 * Created by KEKE on 2019/5/15
 */
public class Main {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyBlock buyBlock = new BuyBlock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyBlock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
