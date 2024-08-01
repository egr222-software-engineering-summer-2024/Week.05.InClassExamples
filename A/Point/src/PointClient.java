import java.awt.*;

// A client using the Java Point class contained in the java.awt package
public class PointClient {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(20, 100);

        System.out.println("Point 1 is " + p1);
        System.out.println("Point 2 is " + p2);

        p2.translate(-3, 6);    // moves p2 left 3 and down 6
        System.out.println("Point 2 is " + p2);

        System.out.println("Point 2 is " + p2.distance(0,0) + " pixels from the origin (0,0)");

        int sum = p2.x + p2.y;
        System.out.println("Sum of coordinates of p2 = " + sum);

        p1.x = 5;
        System.out.println(p1);

//        DrawingPanel panel = new DrawingPanel(300, 300);
//        Graphics g = panel.getGraphics();

        //The Java version of the Point class does not know how to draw itself - we will have to implement our own to do this
//        p1.draw(g);
//        p2.draw(g);
    }
}