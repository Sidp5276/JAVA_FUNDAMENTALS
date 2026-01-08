package Phase_01;

    import java.util.Scanner;

    public class Q_11_TriangleCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input three sides
            System.out.print("Enter side 1: ");
            int a = sc.nextInt();
            System.out.print("Enter side 2: ");
            int b = sc.nextInt();
            System.out.print("Enter side 3: ");
            int c = sc.nextInt();

            // Check triangle validity using triangle inequality theorem
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("The sides form a valid triangle.");
            } else {
                System.out.println("The sides do NOT form a valid triangle.");
            }

            sc.close();
        }
    }
