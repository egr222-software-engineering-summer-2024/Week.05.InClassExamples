import java.awt.Graphics;

public class Point {
    int x;
    int y;

    public Point() {
        this(10, 10);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}