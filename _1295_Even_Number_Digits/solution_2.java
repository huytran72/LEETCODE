
// Convert to String

public class solution_2 {
    int count = 0;
    
    public int findNumbers(int[] nums) {
        for(int a: nums) {
            int len = String.valueOf(a).length();
            if(len % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {555,901,482,1771, 1, 22, 333, 4444};

        solution_2 sol = new solution_2();
        int res = sol.findNumbers(nums);

        System.out.println("Count of numbers with even digits: " + res);
    }
}
