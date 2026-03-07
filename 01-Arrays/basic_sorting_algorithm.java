// Problem: Sorting an Array 
// Approach: 
         // 1. Bubble Sorting: We define No. of turns and No. of swaps using loop then do swapping of largest to right most at each tern
         // 2. Selective Sorting: We initiallize a minPos then at each loop, we runs another loop to find min. element position and just swap with i 
         // 3. Insertion Sorting: We use curr and prev and insert the curr at it's sorted place in left side. We do shifting when curr>arr[prev] and shift the [prev] index to [prev+1] index
         // 4 Count Sorting: We find largest from arr then make a count arr of lenght largest+1 by using count[arr[i]]++; then while count[i]>0 we do arr[j] = i 
// Time Complexity: Except CountSort( O(n+k) ) all hava O(n^2)
// Space Complexity:  Except CountSort( O(k) ) all hava O(1)
// Source: Apna College Sigma 11.0 Batch 


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 5, 4, 1, 3, 2 };
        insertionSort(numbers);
        printArray(numbers);

    }
    // Negative element array can't be sorted by this because inside count array we count frequency of the index element .
    
    
        public static void countingSort(int[] numbers){ // This Sorting is for array whose range like(1-10, etc.) is less but frequency is large 
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<numbers.length;i++){ // THIS to find out the max rnnge of the count array
            largest = Math.max(largest,numbers[i]);
        }
        int[] count = new int[largest+1];
        for(int i=0 ; i<numbers.length;i++){
            count[numbers[i]]++; // THIS will actually count frequency of a number at it's value index..
        }
        // Sorting 
        int j =0;
        for(int i=0 ; i<count.length ; i++){
            while(count[i] > 0){ // if the element at i index is not zero then 
                numbers[j] = i ;  // make that index, the element of Original array 
                j++; // now go to next pos of Orginal array
                count[i]--; // decrease the frequecy and again save that index in main array
            }

        }
    }

    public static void insertionSort(int[] numbers){
        for(int i=1 ; i<numbers.length ; i++){
            int curr = numbers[i]; // we created current just to insert it's value at the place of prev after shifting completed 
            int prev = i-1 ; 
            // finding out the correct Pos. to insert
            while(prev >=0 && numbers[prev] > curr){
                // Here we used Prev + 1 not curr because we are using curr just to store the element at i so that after shifting we can replace the value at prev index with curr.
                numbers[prev+1] = numbers[prev]; // prev + 1 is just current i and this line basically make the current i value same as prev i.e i-1 , if condition is true
                prev -- ; 
            }
            // insertion 
            numbers[prev+1] = curr ; // we do prev+1 because in while loop prev getting -1 each time it loops 

        }

    }

    public static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            boolean check = false;
            int minelementPos = i;
            for (int j = i + 1; j < numbers.length; j++) {
                // If we just reverse the > then we will get the decreasing order
                if (numbers[minelementPos] > numbers[j]) {
                    minelementPos = j;
                    check = true;
                }
            }

            if (!check)
                break;
            // swap

            // OR for optimization you could just do if(minelementPos == i) break or do the
            // swap only when not equal ;
            int temp = numbers[minelementPos];
            numbers[minelementPos] = numbers[i];
            numbers[i] = temp;

        }

    }

    public static void bubbleSorting(int[] numbers) {
        // Outer loop for no. of turn
        for (int turn = 0; turn < numbers.length - 1; turn++) {
            int swap = 0;
            // inner loop for no. of swaps happening i.e each time it will decrease by -turn
            for (int j = 0; j < numbers.length - 1 - turn; j++) {
                // To swap
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    // TO keep track of the swapping
                    swap++;

                }
            }
            // THIS conditon for the case of complete sorted array.
            if (swap == 0)
                break;
        }
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
} 
