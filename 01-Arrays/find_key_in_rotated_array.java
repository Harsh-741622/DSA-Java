// Problem: Find Key in Rotated Array
// Approach: At every instance one side either right or left is ALWAYS Sorted 
//           Condition to check left side is sorted is arr[start] <= arr[mid] { equals is imp since sometime key present at start == last } 
// Time Complexity: O(logn)
// Space Complexity: O(1)
// Logic: At every instance one side either right or left is ALWAYS Sorted 
//        Condition to check left side is sorted is arr[start] <= arr[mid] { equals is imp since sometime key present at start == last } 
// Source: Apna College Sigma 11.0 Batch 



public class Main {
    public static void main(String args[]) {
        int[] nums = { 4,5,6,7,0,1,2,3 };
        int key = 6 ; 
        System.out.print("The Index is : " + BinarySearch(nums, key));
      

    }

    public static int  BinarySearch(int[] numbers , int key) {
        int start = 0 , last = numbers.length -1 ; 
        while(start <= last){
            int mid = (start + last)/2 ;
            if(numbers[mid] == key){
                return mid;
            }
            // if Left Sorted 
            if(numbers[start] <= numbers[mid]){
                if(numbers[start] <= key && key < numbers[mid]){ // Since we already checked mid == key so we don't need to check key <= numbers[mid];
                    last = mid - 1 ; 
                } else {
                    start = mid + 1 ; 
                }
            }
            // if Right Sorted 
            else { // arr[start] > arr[mid] 
                 if(numbers[mid] < key && key <= numbers[last]){ // Check if key inside the right sorted array or not ! 
                    start = mid + 1 ; 
                } else {
                    last = mid - 1 ; 
                }
            }
           
        }
        return -1 ; 
    }

}
