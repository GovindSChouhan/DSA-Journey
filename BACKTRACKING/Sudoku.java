public class Sudoku{
    // Function to check if placing a digit is safe
    public static boolean isSafe(int sudoku[][], int row , int col, int digit){
        // Column check: Ensure digit is not present in the current column
        for(int i = 0; i < 9; i++){
            if(sudoku[i][col] == digit){// Checks the column (going down).
                return false;
            }
        }
        
        // Row check: Ensure digit is not present in the current row
        for(int j = 0; j < 9; j++){
            if(sudoku[row][j] == digit){//Checks the row (going sideways).
                return false;
            }
        }
        
        // 3x3 Grid check: Find the starting row and column of the grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        
        // Ensure digit is not present in the 3x3 grid
        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true; // If digit is not found in row, column, or grid, it is safe to place
    }

    // Recursive function to solve Sudoku
    public static boolean sudokuSolver(int sudoku[][], int row , int col){
        // Base case: If we have reached beyond the last row, the puzzle is solved
        if(row == 9){
            return true;
        } 
        
        // Move to the next column; if at the last column, move to the next row
        int nextRow = row, nextCol = col + 1;//(move to the same row in the next colmn)
        if(col+1 == 9) {
            nextRow = row + 1;//(go down)
            nextCol = 0;// Start from the first column of the new row

        }
        
        // If cell is already filled, move to the next cell
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1-9 in the empty cell
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit; // Place the digit
                
                // Recursively solve for the next cell
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                
                sudoku[row][col] = 0; // Backtrack if placing digit leads to no solution
            }
        }
        return false; // No valid number found, return false
    }

    // Function to print the solved Sudoku grid
    public static void printSudoku(int sudoku[][]){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // Input Sudoku grid (0 represents empty cells)
        int sudoku[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        
        // Solve Sudoku and print the solution if it exists
        if(sudokuSolver(sudoku, 0,0)){
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
