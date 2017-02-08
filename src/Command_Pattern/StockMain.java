package Command_Pattern;

/**
 * Created by Optimus82 on 05.02.17.
 */
public class StockMain {

    public static void main(String[] args) {

        Stock myStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(myStock);
        SellStock sellStockOrder = new SellStock(myStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();





    }
}
