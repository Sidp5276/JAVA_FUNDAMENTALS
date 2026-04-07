package Phase_04_Array;
import java.util.*;
public class Q36_Array_FirstOccurrence {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter number to find: ");
            int target = sc.nextInt();

            int index = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("First occurrence at index: " + index);
            } else {
                System.out.println("Number not found in array.");
            }
        }
    }