package HASHSET;
import java.util.HashSet;

public class Q6_PairSum {
    static void main(String[] args) {
        int[] nums = {10, 5, 2, 3, -1};
        int target = 8;

        if (hasPairWithSum(nums, target)) {
            System.out.println("Target sum pair ");
        } else {
            System.out.println("No such pair");
        }
    }

    public static boolean hasPairWithSum(int[] nums, int target) {

        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {

            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}
