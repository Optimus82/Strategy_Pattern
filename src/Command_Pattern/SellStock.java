package Command_Pattern;

/**
 * Created by Optimus82 on 05.02.17.
 */
public class SellStock implements Order {

    private Stock myStock;

    public SellStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
       myStock.sell();
    }
}
