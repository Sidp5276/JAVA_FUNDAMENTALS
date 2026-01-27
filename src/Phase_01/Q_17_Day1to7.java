package Phase_01;
import java.util.Scanner;

public class Q_17_Day1to7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer between 1 and 7.");
            scanner.close();
            return;
        }

        int dayNumber = scanner.nextInt();

        // Determine the day name
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = null;
        }

        if (dayName != null) {
            System.out.println("Day " + dayNumber + " is: " + dayName);
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

    }
}
