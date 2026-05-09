package HASHSET;
import java.util.HashSet;
import java.util.ArrayList;

public class Q3_Array_Intersection {
    static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = findIntersection(nums1, nums2);

        System.out.print("Intersection: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectSet.add(num);
            }
        }

        int[] result = new int[intersectSet.size()];
        int index = 0;
        for (int num : intersectSet) {
            result[index++] = num;
        }

        return result;
    }
}
