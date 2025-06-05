package _1295_Even_Number_Digits;


public class solution_1 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int a: nums) {
            if(numsofDigits(a) % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public int numsofDigits(int a) {
        int cnt = 0;

        while( a != 0) {
            a /= 10;
            cnt++;
        }
        return cnt;
    }


    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};

        solution_1 sol = new solution_1();
        int result = sol.findNumbers(nums);

        System.out.println("Count of numbers with even digits: " + result);
    }
    
}




