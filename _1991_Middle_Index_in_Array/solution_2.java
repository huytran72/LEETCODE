// package _1991_Middle_Index_in_Array;

// Idea:
// 1. Calculate the total sum of the array.
// 2. Loop the array from left to right
// 2.1. leftSum is the sum of elements from 0 to i - 1
// 2.2. rightSum is sum - leftSum - nums[i]
// 3. If leftSum equals rightSum, return i.
// 4. If no such index is found, return -1.

public class solution_2 {
    public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        

        for(int num: nums) {
            sum += num; // Calculate total sum of the array
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i]; // Calculate right sum

            if(leftSum == rightSum) {
                return i; // Return the leftmost middle index
            } else {
                leftSum += nums[i]; // Update left sum for the next iteration
            }
        }

        return -1; // If no middle index found, return -1
    };

    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};  // Output: 3
        int[] nums2 = {1, -1, 4};          // Output: 2
        int[] nums3 = {2, 5};               // Output: -1
        int[] nums4 = {1,3,4,7,8,3,4,-2,6}; // Output: -1

        System.out.println(findMiddleIndex(nums)); 
        System.out.println(findMiddleIndex(nums2));
        System.out.println(findMiddleIndex(nums3));
        System.out.println(findMiddleIndex(nums4));
    }
}

// TYime Complexity: O(n)
// Space Complexity: O(1) - We are using a constant amount of space for variables.