// Problem: Maximum Subarrays Sum 
// Approach: Prefix Sum
// Time Complexity: O(n^2) 
// Space Complexity: -
// Source: Apna College Sigma 11.0 Batch

// Logic: Create a array which contain sum of element of arr[] till ith index at each index of the new array. 
//         then currsum = prefixSumarray[end] - prefixSumarray[start -1]

public class Main {
    public static void main(String args[]) {
        int[] numbers = { 2, 4, 1, 5, -2, 5 };
        MaxSumOfSubarrays(numbers);

    }

    public static void MaxSumOfSubarrays(int[] numbers) {
        int n = numbers.length;
        int sum = 0;
        // Creating Prefix sum array : 
        int[] prefixSumArray = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            prefixSumArray[i] = sum;

        }
        int maxSum = Integer.MIN_VALUE;
        // Finding max :
        for (int i = 0; i < n; i++) {
            int start = i ; 
            for (int j = i; j < n; j++) {
                int end = j;
                int currSum = 0 ; 
                // currSum = prefixSumarray[end] - prefixSumarray[start -1];  
                currSum = start == 0 ? prefixSumArray[end] : prefixSumArray[end] - prefixSumArray[start-1] ;
                if(maxSum < currSum){
                    maxSum = currSum; 
                }
               
            }
        }
        System.out.println("Max sum " + maxSum);

    }
}
