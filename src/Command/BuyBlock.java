package Command;

/**
 * Created by KEKE on 2019/5/15
 */
public class BuyBlock implements Order {

    private Stock abcStock;

    public BuyBlock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
