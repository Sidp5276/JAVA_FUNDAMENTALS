package Phase_01;
// Take 24-hour time (hours and minutes) and print whether it is AM or PM.
import java.util.Scanner;
public class Q_32_TimeFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours (0-23): ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time entered!");
        } else {
            if (hours < 12) {
                System.out.println("It is AM");
            } else {
                System.out.println("It is PM");
            }
        }
    }
}
