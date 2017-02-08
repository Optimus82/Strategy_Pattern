package Command_Pattern;

/**
 * Created by Optimus82 on 05.02.17.
 */
public class Stock {

    private String name = "New Economy First";
    private int quantity = 100;

    public void buy (){
        System.out.println("Stock [ Name: " +name+", Quantity: " +quantity+" ] Bought");

    }

    public void sell (){
        System.out.println("Stock [ Name: " +name+", Quantity: " +quantity+" ] Sold");
    }
}
