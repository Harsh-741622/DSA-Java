// Problem: Create spiral matrix
// Approach: intitalize startRow,endRow,StartCol,endCol then Print top->left->bottom->right
// Time Complexity: O(n × m)
// Space Complexity: O(1) 
// Source: Apna College Sigma 11.0 Batch


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        SpiralMatrix(matrix);

    }

    public static void SpiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow){ // This is the edge condtion when No. of Row is less than No. of Column at that time IT AVOIDS THE DUPLICATE PRINT OF ROW AGAIN WHEN startRow == endRow because it already printed during top.
                    break ; 
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {// This is the edge condtion when No. of Column is less than No. of Row at that time IT AVOIDS THE DUPLICATE PRINT OF cOLUMN AGAIN WHEN startCol == endCol because it already printed during right.
                if(startCol==endCol){
                    break ; 
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

    }

}
