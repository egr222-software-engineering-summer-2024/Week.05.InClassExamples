import java.awt.Graphics;

public class PointClient {

    public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300,300);
		Graphics g = panel.getGraphics();

	    Point p1 = new Point(50, 65);
//	    p1.x = 50;
//	    p1.y = 65;
	    Point p2 = new Point(104,83);
//	    p2.x = 104;
//	    p2.y = 83;
		Point p3 = new Point(-5, -1);
	    //p3.x = -5;

	    System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

        // move p2 and then print it
		p2.translate(2,1);

		System.out.println(p2);

		p1.draw(g);
		p2.draw(g);

		System.out.println("P1 is " + p1.distanceFromOrigin() + " from the origin.");
		System.out.println("P2 is " + p2.distanceFromOrigin() + " from the origin.");

		System.out.println("Distance from P1 to P2 is " + p1.distanceTo(p2));
    }

}