import java.awt.Graphics;

public class Visitor {
    //singleton implementation
    private Visitor() {}
    private static Visitor instance;
    public static Visitor getInstance() {
        if (instance == null){
            instance = new Visitor();
        }
        return instance;
    }

    void draw(Square s){
        Graphics g = s.panel.getGraphics();
		g.setColor(s.c);
		g.fillRect(s.x, s.y, s.width, s.height);
    }

    void draw(Triangle t){
        Graphics g = t.panel.getGraphics();
		g.setColor(t.c);
		g.drawLine(t.x1, t.y1, t.x2, t.y2);
		g.drawLine(t.x1, t.y1, t.x3, t.y3);
		g.drawLine(t.x2, t.y2, t.x3, t. y3);
    }

    void draw(Circle c){
        Graphics g = c.panel.getGraphics();
		g.setColor(c.c);
		g.fillOval(c.x, c.y, c.width, c.height);
    }

    

}
