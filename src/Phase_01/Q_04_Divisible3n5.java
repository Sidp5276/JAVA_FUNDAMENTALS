package Phase_01;
//Check if a number is divisible by both 3 and 5.

    import java.util.Scanner;

    public class Q_04_Divisible3n5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            // Check if divisible by both 3 and 5
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " is divisible by both 3 and 5");
            } else {
                System.out.println(n + " is NOT divisible by both 3 and 5");
            }

            // Check if divisible by 3 or 5 (either one)
            if (n % 3 == 0 || n % 5 == 0) {
                System.out.println(n + " is divisible by 3 or 5");
            } else {
                System.out.println(n + " is NOT divisible by 3 or 5");
            }

            sc.close();
        }
}
