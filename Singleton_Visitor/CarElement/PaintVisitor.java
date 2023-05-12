public class PaintVisitor implements Visitor {
    private PaintVisitor(){};
    private static PaintVisitor instance = null;

    public static PaintVisitor getInstance(){
        if (instance == null){
            instance = new PaintVisitor();
        }
        return instance;
    }

    
    public void visit(Engine engine) {
        System.out.println("Painting engine");
    }

    public void visit(Wheel wheel) {
        System.out.println("Painting wheel");
    }

    public void visit(Body body) {
        System.out.println("Painting body");
    }
}