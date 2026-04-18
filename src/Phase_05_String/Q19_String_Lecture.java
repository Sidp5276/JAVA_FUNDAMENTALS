package Phase_05_String;
import java.util.Scanner;
public class Q19_String_Lecture {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");

// Insert char
        sb.insert(0, 'b');
        System.out.println(sb);

        //delete char
        sb.delete(1,2);
        System.out.println(sb);

        //append char(to add something at the end)
        sb.append("ji");
        System.out.println(sb);

        //print length of the string
        System.out.println((sb.length()));

    }
}
