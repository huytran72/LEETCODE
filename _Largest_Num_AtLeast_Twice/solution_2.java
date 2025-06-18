// package _Largest_Num_AtLeast_Twice;

// Solution 2: Using a single pass to find the largest number and check the condition simultaneously

// Idea:
// 1. Loop and find 1st max and 2nd max
// 2. Find maxVal and maxIndex
// 3. Find secondMax
// 4. If maxVal >= 2 * secondMax, return maxIndex


// Implementation:
// 1. Create 3 variables: maxVal, secondMax, and maxIndex 
// 2. Loop: 
//   - If nums[i] > maxVal, then:
//     - Update secondMax = maxVal
//     - Update maxVal = nums[i]
//     - Update maxIndex = i
//   - Else if nums[i] > secondMax, then:
//     - Update secondMax = nums[i]
// 3. After the loop, check if maxVal >= 2 * secondMax
//  If true, return maxIndex; otherwise, return -1

public class solution_2 {
    public static int domiantIndex(int[] nums) {

        if(nums.length == 0) return -1; // Handle empty array case

        int maxVal = -1;
        int secondMax = -1;
        int maxIndex = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxVal) {
                secondMax = maxVal; // Update second max before changing max
                maxVal = nums[i]; // Update max
                maxIndex = i; // Update index of max
            } else if(nums[i] > secondMax) {
                secondMax = nums[i]; // Update second max if current is greater
            }
        }

        // Check if the largest number is at least twice as large as the second largest
        if(maxVal >= 2 * secondMax) {
            return maxIndex; // Return index of the largest number
        } else {
            return -1; // Return -1 if condition is not met
        }

    }

    // Test Case
    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        System.out.println(domiantIndex(nums1)); // Output: 1

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(domiantIndex(nums2)); // Output: -1

        int[] nums3 = {10, 5, 2, 1};
        System.out.println(domiantIndex(nums3)); // Output: 0
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
