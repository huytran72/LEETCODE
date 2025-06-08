// package _88_Merge_Shorted_Array;

public class solution_1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        while ( i< m) {
            merged[k++] = nums1[i++];
        }

        for (int x = 0; x < m + n; x++) {
            nums1[x] = merged[x];
        }
    }

    //Test case
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