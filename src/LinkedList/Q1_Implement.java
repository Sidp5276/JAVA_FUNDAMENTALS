package LinkedList;
import java.util.*;

public class Q1_Implement {
    public static void main(String[] args) {

LinkedList<String> list = new LinkedList<String>();
list.add("is");
list.add("a");
list.addFirst("this");
list.addLast("list");
System.out.println(list);

System.out.println(list.get(0));
System.out.println(list.size());
list.remove(2);
list.removeFirst();
list.removeLast();
System.out.println(list);
}
}