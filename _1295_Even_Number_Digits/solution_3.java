// Using Math method to count even digit numbers

public class solution_3 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int a: nums) {
            int numsofDigits = (int) Math.floor(Math.log10(a)) + 1;

            if (numsofDigits % 2 == 0) {
                count++;
            }
    
        }
        return count;
    }

    public static void main(String[] args) {
        // int nums[] = {555, 901, 482, 1771, 1, 22, 333, 4444};
        int nums[] = {11, 22, 3333, 4444, 55555, 666666};


        solution_3 sol = new solution_3();
        int result = sol.findNumbers(nums);

        System.out.println("Count of numbers with even digits: " + result);
        }
    
}
