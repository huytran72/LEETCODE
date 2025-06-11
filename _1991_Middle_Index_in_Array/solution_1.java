// package _1991_Middle_Index_in_Array;
// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

// Example 1:

// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4
// Example 2:

// Input: nums = [1,-1,4]
// Output: 2
// Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
// The sum of the numbers after index 2 is: 0
// Example 3:

// Input: nums = [2,5]
// Output: -1
// Explanation: There is no valid middleIndex.
 
// Constraints:
// 1 <= nums.length <= 100
// -1000 <= nums[i] <= 1000




// METHOD: BRUTE FORCE
// Idea:
// 1. Iterate through each index i of the array.
// 2. For each index i, calculate the sum of elements to the left and right.
// Sum of Left: from 0 to i - 1
// Sum of Right: from i + 1 to nums.length - 1 

public class solution_1 {
    public static int findMiddleIndex(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum =0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate right sum  
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            
        
            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i; // Return the leftmost middle index
            }
        }
        return -1; // If no middle index found, return -1
    };

    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};
        System.out.println(findMiddleIndex(nums)); // Output: 3

        nums = new int[]{1, -1, 4};
        System.out.println(findMiddleIndex(nums)); // Output: -1

        nums = new int[]{2, 5};
        System.out.println(findMiddleIndex(nums)); // Output: -1
    }
}

// Time Complexity: O(n^2) - For each index, we calculate the left and right sums which takes O(n) time.

// Space Complexity: O(1) - We are using a constant amount of space for the left and right sums.

