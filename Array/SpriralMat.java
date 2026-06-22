import java.util.*;
public class SpriralMat{
   public static void Spiral(int mat[][]){
    int sr = 0;//top
    int er = 3;//bottom
    int sc = 0; // mat[0].length-1;//left
    int ec = 3;//right

        while(sr <= er && sc <= ec){
            for(int j = sc ;j<=ec;j++){
                System.out.print(mat[sr][j]);
               
            }
             sr++;
            for(int i = sr;i<=er;i++){
                System.out.print(mat[i][ec]);
                
            }
            ec--;
            for(int j = ec; j>=sc;j--){
                System.out.print(mat[er][j]);
            }
            er--;
            for(int i = er;i>=sr;i--){
                System.out.print(mat[i][sc]);
            }
            sc++;
        }
   }
    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}

 

        };
        Spiral(mat);
    }
}