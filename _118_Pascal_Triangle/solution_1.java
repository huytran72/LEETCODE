// package _118_Pascal_Triangle;

import java.util.ArrayList;
import java.util.List;

public class solution_1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        // Handle edge cases
        if(numRows <= 0) {
            return pascalTriangle;
        } else if(numRows == 1) {
            pascalTriangle.add(List.of(1));
            return pascalTriangle; 
        } else if(numRows == 2) {
            pascalTriangle.add(List.of(1));
            pascalTriangle.add(List.of(1, 1));
            return pascalTriangle;
        }
    }




    public static void main(String[] args) {
        
    }
}
