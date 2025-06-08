
import java.util.Arrays;


// package _88_Merge_Shorted_Array;

public class solution_3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j =0 ; j < n ; j++) {
            nums1[j+m] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    // Test case
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 9, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution_3 solution = new solution_3();
        solution.merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

// // Time Complexity: O((m + n) log(m + n)) - The sorting step dominates the time complexity.
// // Space Complexity: O(1) - No extra space is used for merging, we modify nums1 in place.
