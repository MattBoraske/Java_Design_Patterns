public class Buy implements Order {
    private int shares;
    private String symbol;
    private Broker broker;

    Buy(int shares, String symbol, Broker b){
        this.shares = shares;
        this.symbol = symbol;
        this.broker = b;
    }

    public void execute(){
        broker.buy(symbol, shares);
    }

    //undo of buy is sell
    public void undo(){
        broker.sell(symbol, shares);
    }
}
