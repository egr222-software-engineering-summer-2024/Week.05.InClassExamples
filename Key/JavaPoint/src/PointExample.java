// A client program that uses Point objects.
import java.awt.*;

 public class PointExample {
     public static void main(String[] args) {
         Point p = new Point(3, 8);
         System.out.println("initially p = " + p);
         p.translate(-1, -2);
         System.out.println("after translating p = " + p);
     }
 }