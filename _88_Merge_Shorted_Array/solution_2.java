// package _88_Merge_Shorted_Array;

public class solution_2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n -1;
        int p = m + n - 1;

        while ( p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }

        while ( p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }

    // Test case
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution_1 solution = new solution_1();
        solution.merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

// Time Complexity: O(m + n)
// Space Complexity: O(1) - No extra space is used for merging, we modify nums1 in place.