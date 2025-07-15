package _217_;

public class Contains_Duplicate {
    
}

/*
*** Solution 1: Brute Force
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;

--------------------------------------
*** Solution 2: Hashmap
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int num: nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for(int i: map.values()) {
        if(i != 1) return true;
    }
    return false;

- TC: O(n)
- SC: O(n)


HashMap:
1: 2
2: 1
3: 1

--------------------------------------
*** Solution 3: Set
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
- TC: O(n)
- SC: O(n)

*/
