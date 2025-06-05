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


    private int numsofDigits(int a) {
        
        throw new UnsupportedOperationException("Unimplemented method 'numsofDigits'");
    }


    public static void main(String[] args) {
        
    }
    
}




