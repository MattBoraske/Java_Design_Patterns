import java.awt.Color;

public class Circle implements Shape {	
	DrawingPanel panel = null;
	Color c = Color.BLUE;
	int x = 20;
	int y = 70;
	int width = 50;
	int height = 50;
	
	public Circle(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw(Visitor visitor) {
		visitor.draw(this);
	}
}
