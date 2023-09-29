import java.util.HashMap;

public class twoSum3 {
    
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int newtarget = target - nums[i];
            if(arrMap.containsKey(newtarget)) {
                return new int[] {arrMap.get(newtarget), i};
            }
            else {
                arrMap.put(nums[i], i);
            }
        }
        return new int[] {};

        
    }
}
