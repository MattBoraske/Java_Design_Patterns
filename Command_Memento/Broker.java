import java.util.ArrayList;
import java.util.List;

public class Broker {
    private String name;

    private List<Order> orders = new ArrayList<Order>();

    Broker(String name){
        this.name = name;
    }

    public void buy(String symbol, int shares){
        System.out.println("Stock [Ticker Symbol : " + symbol + ", Shares : " + shares + "] bought from " + name);
    }

    public void sell(String symbol, int shares){
        System.out.println("Stock [Ticker Symbol : " + symbol + ", Shares : " + shares + "] sold to " + name);
    }

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        for (Order order: orders){
            order.execute();
        }
        orders.clear();
    }
}
