package Phase_01;
import java.util.Scanner;

public class Q_18_DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer between 1 and 12.");
            scanner.close();
            return;
        }

        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a value between 1 and 12.");
        } else {
            int days;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    days = 28; // Ignoring leap years
                    break;
                default:
                    days = 0; // This should never happen due to earlier validation
            }
            System.out.println("Number of days: " + days);
        }

        scanner.close();
    }
}

