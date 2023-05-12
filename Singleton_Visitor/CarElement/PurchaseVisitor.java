public class PurchaseVisitor implements Visitor {
    private PurchaseVisitor() {};
    private static PurchaseVisitor instance = null;

    public static PurchaseVisitor getInstance(){
        if (instance == null){
            instance = new PurchaseVisitor();
        }
        return instance;
    }
    
    public void visit(Engine engine) {
        System.out.println("Purchasing engine");
    }

    public void visit(Wheel wheel) {
        System.out.println("Purchasing wheel");
    }

    public void visit(Body body) {
        System.out.println("Purchasing body");
    }
}
