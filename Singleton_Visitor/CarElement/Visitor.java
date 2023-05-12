public interface Visitor {
    public void visit(Engine engine);

    public void visit(Body body);

    public void visit(Wheel wheel);
}
