// A client using the Custom Point class
import java.awt.*;

public class PointClient {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics g = panel.getGraphics();

        Point.setEarthquakeOrigin(new Point(250, 250));
        Point.setEarthquakeImpactRadius(160);

        Point p1 = new Point(50, 65);
        Point p2 = new Point(104,83);
        Point p3 = new Point(154, 75);
        Point p4 = new Point(280, 280);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Point.drawEarthquakeOrigin(g);
        p1.draw(g);
        p2.draw(g);
        p3.draw(g);
        p4.draw(g);

        System.out.println("P1 is " + p1.distanceFromEarthquakeOrigin() + " from the earthquake origin.");
        System.out.println("P2 is " + p2.distanceFromEarthquakeOrigin() + " from the earthquake origin.");
        System.out.println("P3 is " + p3.distanceFromEarthquakeOrigin() + " from the earthquake origin.");
        System.out.println("P4 is " + p4.distanceFromEarthquakeOrigin() + " from the earthquake origin.");
    }
}