package Phase_04_Array;
import java.util.*;
public class Q6_Array_PositiveNegative {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            for (int num : arr) {
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            System.out.println("Positive numbers: " + positiveCount);
            System.out.println("Negative numbers: " + negativeCount);
            System.out.println("Zeros: " + zeroCount);
        }
    }

