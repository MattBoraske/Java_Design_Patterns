import java.awt.Color;

public class Triangle implements Shape {
	DrawingPanel panel = null;
	Color c = Color.GREEN;
	int x1 = 50;
	int y1 = 150;
	int x2 = 200;
	int y2 = 50;
	int x3 = 150;
	int y3 = 150;
	
	public Triangle(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw(Visitor visitor) {
		visitor.draw(this);
	}
}
