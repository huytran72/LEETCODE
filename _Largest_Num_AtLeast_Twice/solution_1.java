// package _Largest_Num_AtLeast_Twice;

// You are given an integer array nums where the largest integer is unique.
// Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

// Example 1:
// Input: nums = [3,6,1,0]
// Output: 1
// Explanation: 6 is the largest integer.
// For every other number in the array x, 6 is at least twice as big as x.
// The index of value 6 is 1, so we return 1.


// Example 2:
// Input: nums = [1,2,3,4]
// Output: -1
// Explanation: 4 is less than twice the value of 3, so we return -1.


// Solution:
// Step 1: 
// 1. Create a variable maxVal to store the largest value (initially set to nums[0])
// 2. Create a variable maxIndex to store the index of maxVal (initially set to 0)
// 3. Loop through each element in the array:
// 4. If nums[i] > maxVal, then:
// 5. Update maxVal = nums[i]
// 6. Update maxIndex = i
// After finishing the loop, maxVal will hold the largest number, and maxIndex will be its index.

// Step 2:
// 1. Loop through the array again to check if the largest number is at least twice every other number.
// 2. For each element nums[i]:
// If i is the same as maxIndex, skip it (because we're comparing the largest number with the other numbers).
// Otherwise, check if maxVal < 2 * nums[i]:
// If this is true, it means the largest number is not at least twice as big as this number → return -1
// 3. If no violations are found after checking all elements, return maxIndex





public class solution_1 {
    public static int domiantIndex(int[] nums) {
        int maxVal = nums[0];
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && maxVal < 2 * nums[i]) {
                return -1;
            }
        }
        return maxIndex;
    };

    // Test case
    public static void main(String[] args) {
        int[] nums1 = {3,6,7,9};
        System.out.println(domiantIndex(nums1)); // Output: -1

        int[] nums2 = {1,2,3,4};
        System.out.println(domiantIndex(nums2)); // Output: -1

        int[] nums3 = {1,2,3,6};
        System.out.println(domiantIndex(nums3)); // Output: 3

        int[] nums4 = {3,6,1,0};
        System.out.println(domiantIndex(nums4)); // Output: 1

    }
}


