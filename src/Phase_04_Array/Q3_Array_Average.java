package Phase_04_Array;
import java.util.*;
public class Q3_Array_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = (double) sum / n;

        System.out.println("Average of array elements = " + average);
    }
}
