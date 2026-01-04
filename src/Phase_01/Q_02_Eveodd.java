package Phase_01;
//Check if a number is even or odd.
    import java.util.Scanner;

    public class Q_02_Eveodd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is an odd number");
            }
            sc.close();
        }
    }
