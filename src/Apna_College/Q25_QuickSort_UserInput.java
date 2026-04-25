package Apna_College;
import java.util.*;
public class Q25_QuickSort_UserInput {

        public static void quicksort(int arr[], int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quicksort(arr, low, pi - 1);
                quicksort(arr, pi + 1, high);
            }
        }

        public static int partition(int arr[], int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i++;
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            return i;
        }

        public static void main(String[] args) {
            // 2. Initialize Scanner
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // 3. Take array elements as input
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            quicksort(arr, 0, n - 1);

            System.out.println("Sorted array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }
    }