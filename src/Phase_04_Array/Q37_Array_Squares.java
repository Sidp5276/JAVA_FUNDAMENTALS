package Phase_04_Array;
import java.util.Scanner;
public class Q37_Array_Squares {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            int[] squares = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                squares[i] = arr[i] * arr[i];
            }

            System.out.println("Array of squares:");
            for (int i = 0; i < n; i++) {
                System.out.print(squares[i] + " ");
            }
        }
    }
