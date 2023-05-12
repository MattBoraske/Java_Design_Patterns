public class Main {
    public static void main(String[] args){
        Broker b = new Broker("Fidelity");

        b.takeOrder(Memento.add(new Buy(10, "AAPL", b)));
        b.takeOrder(Memento.add(new Buy(1, "GOOG", b)));
        b.takeOrder(Memento.add(new Sell(8, "AAPL", b)));
        b.placeOrders();
        
        System.out.println("\nMemento stuff:");

        Memento.undo();

        Memento.undo();

        Memento.redo();

        Memento.undo();

        Memento.redo();

        Memento.redo();
    }
}
