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
}