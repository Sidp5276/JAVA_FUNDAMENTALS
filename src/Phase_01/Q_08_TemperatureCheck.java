package Phase_01;

    import java.util.Scanner;

    public class Q_08_TemperatureCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take user input
            System.out.print("Enter temperature value: ");
            int temp = sc.nextInt();

            // Apply range conditions
            if (temp < 15) {
                System.out.println("Cold");
            } else if (temp <= 30) {
                System.out.println("Warm");
            } else {
                System.out.println("Hot");
            }

            sc.close();
        }
    }

