package Phase_04_Array;
import java.util.*;
public class Q34_Array_PairSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the value of k: ");
            int k = sc.nextInt();

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {  // avoid duplicate pairs
                    if (arr[i] + arr[j] == k) {
                        count++;
                        System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    }
                }
            }
            System.out.println("Total number of pairs with sum = " + k + " is: " + count);
        }
    }
