package HASHSET;
import java.util.HashSet;

public class Q2_Duplicate_Check {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};

        if (hasDuplicate(nums)) {
            System.out.println(" Duplicate Elements");
        } else {
            System.out.println("All Unique Elements ");
        }
    }

    public static boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }
        return false;
    }
}
