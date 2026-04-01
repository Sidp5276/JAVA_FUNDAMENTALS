package Phase_04_Array;
import java.util.*;
public class Q27_Array_MultiD {
    public static void main(String[] args) {

        int[][] myArray_1= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Printing a 2D array using nested loops:");
        for (int i = 0; i < myArray_1.length; i++) {
            for (int j = 0; j < myArray_1[i].length; j++) {
                System.out.print(myArray_1[i][j] + " ");
            }
            System.out.println();
        }

        String[][] myArray_2 = {
                {"Welcome", "to", "Tutorials"},
                {"Point", "start", "learning"}
        };
        System.out.println("\nPrinting a 2D array using Arrays.deepToString:");
        System.out.println(Arrays.deepToString(myArray_2));
    }
}

