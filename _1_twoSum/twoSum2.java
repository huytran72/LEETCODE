import java.util.HashMap;

public class twoSum2 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            arrMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int newtarget = target - nums[i];
            if(arrMap.containsKey(newtarget) && arrMap.get(newtarget) != i) {
                return new int[] {i, arrMap.get(newtarget)};
            }
        }
        return new int[] {};
    }
}
