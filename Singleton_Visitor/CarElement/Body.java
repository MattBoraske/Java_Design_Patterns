public class Body implements CarElement {
	public int year = 2008;
	public String role = "protect passengers";
	public String color = "green";
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
