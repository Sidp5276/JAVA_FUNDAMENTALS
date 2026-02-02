package Phase_01;
import java.util.Scanner;
public class Q_24_CoordinatesXY {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter x coordinate: ");
            int x = sc.nextInt();
            System.out.print("Enter y coordinate: ");
            int y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Point lies in Quadrant I.");
            } else if (x < 0 && y > 0) {
                System.out.println("Point lies in Quadrant II.");
            } else if (x < 0 && y < 0) {
                System.out.println("Point lies in Quadrant III.");
            } else if (x > 0 && y < 0) {
                System.out.println("Point lies in Quadrant IV.");
            } else if (x == 0 && y == 0) {
                System.out.println("Point lies at the Origin.");
            } else if (x == 0) {
                System.out.println("Point lies on the Y-axis.");
            } else if (y == 0) {
                System.out.println("Point lies on the X-axis.");
            }

        }
    }
