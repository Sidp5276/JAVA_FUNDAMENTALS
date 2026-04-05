package Phase_04_Array;
import java.util.*;
public class Q33_Array_SecondSmallest {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            if (n < 2) {
                System.out.println("Array must have at least two elements.");
                return;
            }

            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int num : arr) {
                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num < secondSmallest && num != smallest) {
                    secondSmallest = num;
                }
            }

            if (secondSmallest == Integer.MAX_VALUE) {
                System.out.println("No second smallest element (all elements are equal).");
            } else {
                System.out.println("Second smallest element is: " + secondSmallest);
            }
        }
    }
