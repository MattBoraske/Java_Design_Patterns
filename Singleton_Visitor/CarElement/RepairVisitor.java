//implement the visitor interface
public class RepairVisitor implements Visitor {
    private RepairVisitor() {};
    private static RepairVisitor instance = null;

    public static RepairVisitor getInstance(){
        if (instance == null){
            instance = new RepairVisitor();
        }
        return instance;
    }

    public void visit(Engine engine) {
        System.out.println("Repairing engine");
    }

    public void visit(Wheel wheel){
        System.out.println("Repairing wheel");
    }

    public void visit(Body body){ 
        System.out.println("Repairing body");
    }
}

