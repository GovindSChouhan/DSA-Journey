import java.util.Scanner;
class TicTacToe{

    static char[][]  board; //just decreared aa 2d board
     //class not exist in reality only object of the class are exist in reality.
     //when obj of tic toe class is created during this time obj initialization happen & where we use constructor/.
     public TicTacToe(){
         //themoment constructor use i use new,
         board = new char[3][3];//row and colms , and board is refrence..2nd thinh is to initialize the board
         initBoard();
     }
     //arrays are obj in java and obj are  auto initial in java.uniqe code /u0000(a null char)but we want space.
     //now we make a space for x and 0;
 
     void initBoard(){//iterate over 2d arr and asine space
         for(int i = 0;i<board.length;i++){
             for(int j = 0;j<board[i].length;j++){
                 board[i][j] = ' ';//now every cell field with empty char;
 
                 //now to make the board visible i need to display the  board;
             }
         }
     }
    public static void dispboard(){ //j = colms & i = rows
         //if i wont to display the exmpty box 1,want line to come at top.
         System.out.println("--------------");
         //copy paste the loop becoz loop need to done;
         for(int i = 0;i<board.length;i++){
             System.out.print(" | ");// for that one | rightline 
             for(int j = 0;j<board[i].length;j++){
                System.out.print(board[i][j] + " | ");//board[][] mean print wht ever is inside and attache one pipe
             }
             System.out.println();//for cursor
             System.out.println("--------------");//after  that it repeat
         }
     }
      static void placeMark(int row,int colm,char mark){
         if(row >= 0 && row <=2 && colm >= 0 && colm <= 2){// baase case because there r only 0,1,2 col &row (baundary) ,
             board[row][colm] = mark;
         } else{
             System.out.println("learn to play first");
             //now mark are there and 1 will win but now we have to check or make logic who will win the game
         }
     }
     static boolean checkColWin(){
         for(int j = 0;j<=2;j++){ //loop for 0 to 2
             if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j] ) { // win codns
                 return true;
             }
         }
         return false;//if above 1 condn is false colmn wise no one win return false 
     }
     static boolean checkRowWin(){
         for(int i = 0;i<= 2;i++){
             if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                 return true;
             }
         }
         return false;
     }
     static boolean checkDiagWin() {
         // Check the main diagonal
         if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
             return true;
         }
         // Check the anti-diagonal
         if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
             return true;
         }
         return false;
     }
     
 
 
 
 }
 
 class HumanPlayer{
     String name;
     char mark;
 
     //nxt need to initialize these variable,
     //when we create a object of humn player auto name and player isto be selected ...,  use parameterrized constructor
     HumanPlayer(String name, char mark){
         this.name = name;
         this.mark = mark;
     }
     void makeMove(){
         //1. check wheather the move is valid or not mean wheatjer inside the board or not.
         //2. now the move is only allow in the empty place not in pre- occupied, for this we need to access the board which is inside the TicToe class
         //we can assess it without creating a object using just a class name  so declared board as static
 
         Scanner sc = new Scanner(System.in);
         int row;
         int colm;
         //before placing check wheater a valid move or not
         do{
             System.out.println("enter the row and the colmn");
              row = sc.nextInt();
              colm = sc.nextInt();
         }while(!isValidMove(row, colm));
 
         TicTacToe.placeMark(row, colm, mark);
 
     }
     boolean isValidMove(int row, int colm ){
         if(row >= 0 && row <=2 && colm >= 0 && colm <=2){
             if(TicTacToe.board[row][colm] == ' '){
                 return true;
             }
         }
         return false;
     }
 
 }
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class GovVsPlayer {
     public static void main(String[] args) {//class is imag aand obj is real
         TicTacToe t =  new TicTacToe();// t as a refrence ,the movement we create a obj constructor gets called
         //constructor create a new arr, give refrence board called iniBoard to filled eith spaces
         //nxt i have to called disply board
        // t.dispboard();
 
 
       //  t.placeMark(2,2,'X');
        // t.placeMark(1,1,'x');
        // t.placeMark(2,2,'X');
       //  t.placeMark(1,1,'o');
       //  t.placeMark(0,2,'X');
 
 
 
       //  t.dispboard();
 
       /// System.out.println(t.checkDiagWin()); // O/P is t because empty char = char 
       // System.out.println(t.checkRowWin());
        // System.out.println(t.checkColWin());
 
        HumanPlayer p1 = new HumanPlayer("gov" , 'x');
        HumanPlayer p2 = new HumanPlayer("bab" , 'o');
 
        //1 person play a game at a time we need to create mechanism to trac who is current player.
        HumanPlayer cp;//cp is current player who play first.
        cp = p1; //it is refrence type assignment,
         while(true){
             System.out.println(cp.name + " turn");
         cp.makeMove();
         TicTacToe.dispboard();
 
         //now after making move check wheather it result in win or not,check wheater con is true 3method
         if(TicTacToe.checkColWin() || TicTacToe.checkDiagWin() || TicTacToe.checkRowWin()){
             System.out.println(cp.name + "has won");
             break;
         } else{
            if(cp == p1){
                cp = p2;
             } else{
                 cp = p1;
             }
 
         }
         }
 
     }
 }