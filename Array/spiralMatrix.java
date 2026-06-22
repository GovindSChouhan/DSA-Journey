import java.util.Scanner;
public class spiralMatrix {
    public static void Array(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        //startRow is the row you are currently processing.
      //startCol is the starting column index in that row.
      // endCol is the ending column index in that row.


        while (startRow <= endRow && startCol <= endCol) {// The while loop in the function processes the matrix layer by layer, and each layer consists of four sides (top, right, bottom, left).
            // top (j = columns)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }//1,2,3,4
            startRow++;

            // right (i = rows)
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }//8,12,16
            endCol--;

            // bottom (j = columns)
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }//15,14,13
                endRow--;
            }

            // left (i = rows)
            if (startCol <= endCol) {//This helps maintain the integrity of the spiral traversal logic and ensures all elements are processed exactly once.
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }//9,5
                startCol++;
            }//Inner Top Row: 6 7
            //Inner Right Column: 11
           //Inner Bottom Row: 10
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix [][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Array(matrix);
    }
}
