package Phase_01;
//Check if a number lies within the range [100, 999].
import java.util.Scanner;
public class Q_26_Range {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n >=100 &&  n <=999)
        {
            System.out.print(n  +  " It lies inside the range");
            //System.out.println("It is inside range");
        }
        else
        {
            System.out.println("It lies outside the range");
        }
    }
}
