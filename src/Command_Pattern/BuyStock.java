package Command_Pattern;

/**
 * Created by Optimus82 on 05.02.17.
 */
public class BuyStock implements Order {

    private Stock myStock;

    public BuyStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
    myStock.buy();
    }
}
