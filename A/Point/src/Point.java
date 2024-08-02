import java.awt.*;

public class Point {
    private static Point earthquakeOrigin;
    private static int earthquakeImpactRadius = 50;

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    // constructor using polar coordinates (degrees)
    public Point(double r, int angleInDegrees) {
        this((int) (r * Math.cos(Math.toRadians(angleInDegrees))), (int) (r* Math.sin(Math.toRadians(angleInDegrees))));
    }

    // constructor using polar coordinates (radians)
    public Point(double r, double angleInRadians) {
        this((int) (r * Math.cos(angleInRadians)), (int) (r* Math.sin(angleInRadians)));
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

    public void draw(Graphics g) {
        if (earthquakeOrigin != null && distanceFromEarthquakeOrigin() < earthquakeImpactRadius)
            g.setColor(Color.red);
        else g.setColor(Color.black);

        g.fillOval(x, y, 3, 3);
        g.drawString(toString(), x, y);
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y);
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distanceTo(Point p) {
        return Math.sqrt((p.getX() - x)^2 + (p.getY() - y)^2);
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void setEarthquakeOrigin(Point p) {
        earthquakeOrigin = p;
    }

    public static void setEarthquakeImpactRadius(int r) {
        earthquakeImpactRadius = r;
    }

    public static void drawEarthquakeOrigin(Graphics g) {
        if (earthquakeOrigin != null) {
            g.setColor(Color.red);

            // draw point defining earthquake epicenter
            g.fillOval(earthquakeOrigin.x, earthquakeOrigin.y, 3, 3);

            int earthquakeCircleRadius = 5;

//            while (earthquakeCircleRadius < earthquakeImpactRadius) {
//                int earthquakeCircleDiameter = 2 * earthquakeCircleRadius;
//                g.drawOval(earthquakeOrigin.x - earthquakeCircleRadius,
//                        earthquakeOrigin.y - earthquakeCircleRadius,
//                        earthquakeCircleDiameter, earthquakeCircleDiameter);
//
//                earthquakeCircleRadius += 5;
//            }

            g.drawOval(earthquakeOrigin.x - earthquakeImpactRadius, earthquakeOrigin.y - earthquakeImpactRadius, 2 * earthquakeImpactRadius, 2 * earthquakeImpactRadius);
            g.drawString(earthquakeOrigin.toString(), earthquakeOrigin.x + 5, earthquakeOrigin.y + 5);
        }
    }

    public double distanceFromEarthquakeOrigin() {
        int deltaX = x - earthquakeOrigin.x;
        int deltaY = y - earthquakeOrigin.y;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}