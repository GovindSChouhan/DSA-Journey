class TicTacToe{
    char[][] board;
    public TicTacToe(){
        board = new char[3][3];
        initBoard();
    }

    void initBoard(){
       for(int i = 0;i<board.length;i++){//number of rows
              for(int j =0;j<board[i].length;j++){//in a row for perticular colms
               board[i][j] = ' ';
            }
        }
    }
    void DisplayBoard(){

        System.out.println("--------------");

        for(int i = 0;i<board.length;i++){//number of rows
            System.out.print(" | ");
            for(int j =0;j<board[i].length;j++){//in a row for perticular colms

               System.out.print(board[i][j]+ " | ");

            }
            System.out.println();
            System.out.println("--------------");
        }   
    }
    
}

public class TicToeGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.DisplayBoard();
        
    }
}
