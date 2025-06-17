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

        for() {
            
        }

    }
    
}
