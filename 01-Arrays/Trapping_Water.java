// Problem: Trapping Rain Water  
// Approach: Create Two Auxilary array which store RighMax and LeftMax then WaterLevel = Min(RightMax , LeftMax) 
// Time Complexity: O(n)
// Space Complexity: O(n) (Not Yet Optimized Way) 
// Source: Apna College Sigma 11.0 Batch 
import java.util.*;

public class Main {
     public static int TrappingRainwater(int[] height){
        int n = height.length;
        // Max Left boundary 
        int[] MaxLeftB = new int[n];
        MaxLeftB[0] = height[0];
        for(int i=1 ; i<n ; i++){
            MaxLeftB[i] = Math.max(height[i],MaxLeftB[i-1]);
        }
        // Max Right boundary 
        int[] MaxRightB = new int[n];
        MaxRightB[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            MaxRightB[i] = Math.max(height[i],MaxRightB[i+1]);
        }
        // loop
        int trappingwater = 0 ;
        for(int i=0 ; i<n ; i++){
            // Waterlevel
            int waterlevel = Math.min(MaxLeftB[i],MaxRightB[i]);
            // Trapping water 
            trappingwater = trappingwater + (waterlevel - height[i]);
        }
        return trappingwater; 
          
         
     }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int[] height = {1,4,5,6,3,2,6,7,8,4,5,9,7,4};
        int[] height = {4,2,0,6,3,2,5};
        int toatalwater = TrappingRainwater(height);
        System.out.println(toatalwater);
       
    }
}
