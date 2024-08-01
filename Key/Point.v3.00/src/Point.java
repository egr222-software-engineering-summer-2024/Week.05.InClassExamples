import java.awt.Graphics;

public class Point {
    int x;
    int y;

    public Point() {
        this(0,0);
    }

    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public Point(double r, int angleInDegrees) {
        this((int) (r * Math.cos(Math.toRadians(angleInDegrees))), (int) (r* Math.sin(Math.toRadians(angleInDegrees))));
    }

    public Point(double r, double angleInRadians) {
        this((int) (r * Math.cos(angleInRadians)), (int) (r* Math.sin(angleInRadians)));
	}

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void draw(Graphics g) {
        g.fillOval(x,y,3,3);
        g.drawString(this.toString(), x+5, y-5);
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y);
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distanceTo(Point p) {
        return Math.sqrt((p.x - x)^2 + (p.y - y)^2);
    }
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
}