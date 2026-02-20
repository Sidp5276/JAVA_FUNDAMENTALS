package Phase_02;

    import java.util.Scanner;

    public class Q29_LCM {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int lcm = 1;
            for (int i=Math.max(a,b);;i++)
                if(i%a==0 && i%b==0)
                { lcm=i;
                    break;
                }
            System.out.println("LCM of " + a + " and " + b + " = " + lcm);
        }
    }
