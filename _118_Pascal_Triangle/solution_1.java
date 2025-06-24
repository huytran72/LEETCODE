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

        // Base case (numRows >= 3)
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // First element is 1
            row.add(1);

            // Calculate values in the middle
            for(int j = 1; j < i; j++) {
                int value = pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j);
                row.add(value);
            }

            // The last element is 1
            if(i > 0) {
                row.add(1);
            }

            // Add the new row to the list
            pascalTriangle.add(row);
    }




    public static void main(String[] args) {
        
    }
}
