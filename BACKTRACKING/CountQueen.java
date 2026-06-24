public class CountQueen{
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        //checking from the row just above the current row.
        for(int i = row-1; i>= 0;i--){
            if(board[i][col] == 'Q'){
                return false;//// If a queen is found above, it's unsafe
            }
            
        }
        //diag left up ,(up & left)
        for(int i = row-1, j= col-1; i>=0 && j>=0;i--,j--){
           if(board[i][j] == 'Q'){
                return false;

            } 
        }
       // return true;

        //diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length;i--, j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
        
    }
    public static void nQueen(char board[][], int row){

        //base;
 // n queens have been placed successfully without any conflicts.
        if(row == board.length){//savltaPurbak queen beth chuki hai .
           // printBoard(board);//queen combination
           count++;
            return;
        }
        //column loop
        for(int j = 0; j<board.length;j++){// Loop through all columns in the current row
            if(isSafe(board, row, j)){
                
                
                board[row][j] = 'Q'; // iss row mai queen ko bitaya tha
                nQueen(board, row+1);// next row mai bitaya(Function Call)

                board[row][j] = '*';//ab jo row mai queen already hai vha . or next queen;(BACKT STRP)
            }    
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("------CHESS BOARD----");
        for(int  i=0; i<board.length;i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '*';//initially board is khali .
            }
        }
        nQueen(board, 0);
        System.out.println("TOTAL WAYS "+count);
    }
    
}
