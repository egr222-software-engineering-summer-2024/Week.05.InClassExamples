import java.awt.Graphics;

public class Point {
    private int x;
    private int y;

//    public Point() {
//        // initialize variables here
//        this(-1,-1);
//    }

    public Point(int InitialX, int InitialY) {
        x = InitialX;
        y = InitialY;
    }

    public void draw(Graphics g) {
        g.fillOval(x,y,3,3);
        g.drawString("(" + x + ", " + y + ")", x+5, y-5);
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y);
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt((p.getX() - x)^2 + (p.getY() - y)^2);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}