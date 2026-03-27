package Phase_04_Array;
import java.util.*;
public class Q18_Array_PerfectSquare {

        static boolean isPerfectSquare(int num) {
            if (num < 0) return false; // negative numbers can't be perfect squares
            int root = (int)Math.sqrt(num);
            return root * root == num;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for (int num : arr) {
                if (isPerfectSquare(num)) {
                    count++;
                }
            }

            System.out.println("Count of perfect square elements in the array: " + count);
        }
    }

