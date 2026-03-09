package Phase_02_Loops_Patterns;

public class Q18_SquareStar {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
