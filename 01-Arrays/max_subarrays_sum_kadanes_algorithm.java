// Problem: Maximum SubArrays Sum
// Approach: Kadanes Algorithm 
// Time Complexity: O(n)
// Space Complexity: -
// Logic: If currSum < 0 then currSum = 0 
// Source: Apna College Sigma 11.0 Batch 

public class Main {
    public static void main(String args[]) {
        int[] numbers = { 2, 4, 1, 5, -2, 5 };
        kadanes(numbers);

    }

    public static void kadanes(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            curSum = curSum + numbers[i];
            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(curSum, maxSum);
        }
        System.out.print("Our Max Subarrays Sum is : "+ maxSum);

    }

}
