public class Sell implements Order {
    private Broker broker;
    private int shares;
    private String symbol;

    Sell(int shares, String symbol, Broker b){
        this.symbol = symbol;
        this.shares = shares;
        this.broker = b;
    }

    public void execute(){
        broker.sell(symbol, shares);
    }

    //undo of sell is buy
    public void undo(){
        broker.buy(symbol, shares);
    }
}
