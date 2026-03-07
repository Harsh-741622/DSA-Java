//Problem: Find a key in a row and column sorted matrix
// Approach: Using StairCase Search. By the help of Right/Left Corner element .
// Time Complexity: O(n x m)
// Space Complexity: O(1)
// Source: Apna College Sigma 11.0 Batch 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { { 10, 20, 30,40 },
                           { 15, 25, 35, 45 },
                           { 27, 29, 37, 48 },
                           { 32, 33, 39, 50 } };
        int key = 40 ; 
        StairCaseSorting(matrix,key);
    }
    public static boolean StairCaseSorting(int matrix[][] ,int key){

        // THIS is right most point where we start 
        // int row = 0 ; 
        // int col = matrix[0].length -1 ;
        // while( row < matrix.length && col>=0){
        //     if(matrix[row][col] == key){
        //         System.out.print("Found Key! at (" + row +"," + col + ")");
        //         return true ; 
        //     }
        //     else if( key < matrix[row][col]){
        //         col--;
        //     }
        //     else {
        //         row ++ ;
        //     }

        // }
        // System.out.print("Key NOT Found!");
        // return false ; 

        // THIS is the left corner point where we start
        int row = matrix.length-1 ;
        int col = 0 ;
         while( row >= 0 && col < matrix[0].length ){
            if(matrix[row][col] == key){
                System.out.print("Found Key! at (" + row +"," + col + ")");
                return true ; 
            }
            else if( key < matrix[row][col]){
                row--;
            }
            else {
                col++;
            }

        }
        System.out.print("Key NOT Found!");
        return false ; 

    }
}
