// Problem: Find out all unique triplete whose sum is 0 and i != j != k 
// Approach: Sort the array then fix i then use pointer(left,right). See all the duplicate cases.
// Time Complexity: O(n^2) 
// Space Complexity: O(1)
// Source: Apna College Sigma 11.0 Batch 

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1,0,2,1,-1,3,-2};
        triplets(numbers);
    }

    public static void triplets(int[] numbers) {
        Arrays.sort(numbers); // Imp. step 
        int n = numbers.length;

        System.out.print("[");
        boolean first = true;

        for (int i = 0; i < n - 2; i++) { // Why (n-2)? Bec'z Here we are fixing i and then using left and right as pointers so for that i,left,right we did it.

            // skip duplicate starts
            if (i > 0 && numbers[i] == numbers[i - 1]) continue; // Why (i>0)? So that we can compare i with i-1 because if i=0 then i-1 =-1 which is wrong 

            int left = i + 1;
            int right = n - 1;

            while (left < right) { // Why not = ? Because it will make the condition of i!=j!=k false 
                int sum = numbers[i] + numbers[left] + numbers[right];

                if (sum == 0) {
                    if (!first) System.out.print(", ");
                    System.out.print("[" + numbers[i] + ", " + numbers[left] + ", " + numbers[right] + "]");
                    first = false;

                    left++;
                    right--;

                    // skip duplicate left
                    while (left < right && numbers[left] == numbers[left - 1]) left++; 
                    
                    // Why (left<right) needed? because if not then the left++ 
                    // can change the main condtion of loop i.e (left<right) .So to maintain that contain we alway try to limit if any loop is changing the 
                    // main elemets that we are using in the main loop .
                    
                    
                    // skip duplicate right
                    while (left < right && numbers[right] == numbers[right + 1]) right--;

                } else if (sum < 0) { // When sum < 0 means we need to move right side more in sorted array .
                    left++;
                
                // It is necessay to have else condtion in a loop otherwise the left/right will not change if the if condtion is false and this loop will infinite
                
                } else { // When sum is greater then we need to move left side more in a sorted array .
                    right--;
                }
            }
        }

        System.out.println("]");
    }
}
