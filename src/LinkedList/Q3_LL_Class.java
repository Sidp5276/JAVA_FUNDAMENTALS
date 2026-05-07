package LinkedList;

import java.util.LinkedList;

public class Q3_LL_Class {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        System.out.println("Current List: " + list);


        int target = 7;
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element not found in the list.");
        }
    }
}