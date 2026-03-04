// Problem:
// Approach:
// Time Complexity: 
// Space Complexity:
// Logic: 
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
            if(numbers[start] <= numbers[mid]){
                if(numbers[start] <= key && key < numbers[mid]){ // Since we already checked mid == key so we don't need to check key <= numbers[mid];
                    last = mid - 1 ; 
                } else {
                    start = mid + 1 ; 
                }
            } 
            else {
                 if(numbers[mid] < key && key <= numbers[last]){
                    start = mid + 1 ; 
                } else {
                    last = mid - 1 ; 
                }
            }
           
        }
        return -1 ; 
    }

}
