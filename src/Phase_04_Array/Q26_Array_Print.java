package Phase_04_Array;

public class Q26_Array_Print {
    public static void main(String args[]) {

        int[][] int_2DArray = { {1, 2}, {3, 4}, {5,6}};
        System.out.println("Using direct initialization");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 ; j++) {
                System.out.print(int_2DArray[i][j] + " ");
            }
            System.out.println();
        }

        String[][] string_2DArray = new String[2][2];
        string_2DArray[0][0] = "Welcome";
        string_2DArray[0][1] = "to";
        string_2DArray[1][0] = "Tutorials";
        string_2DArray[1][1] = "Point";
        System.out.println("\nUsing indexing ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(string_2DArray[i][j] + " ");
            }
        }

        double[][] double_2DArray = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double_2DArray[i][j] = (i + 1) * (j + 1) * 1.5;
            }
        }
        System.out.println("\n \nUsing nested for Loops");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(double_2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

