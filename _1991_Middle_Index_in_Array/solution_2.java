// package _1991_Middle_Index_in_Array;

// Idea:
// 1. Calculate the total sum of the array.
// 2. Loop the array from left to right
// 2.1. leftSum is the sum of elements from 0 to i - 1
// 2.2. rightSum is totalSum - leftSum - nums[i]
// 3. If leftSum equals rightSum, return i.
// 4. If no such index is found, return -1.

public class solution_2 {
    public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;

        for(int num: nums) {
            sum += num; // Calculate total sum of the array
        }
    };
}
