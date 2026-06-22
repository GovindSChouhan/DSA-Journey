public class DiagonalMine {

    public static int rightS(int mat[][]){
            int sumr = 0;
            for(int i = 0;i<mat.length;i++){
            //  System.out.print(mat[i][i]+" ");
                sumr += mat[i][i];
            } 
            return sumr;   
        }
        public static int leftS(int mat[][]){
            
            int sums = 0;
            for(int i = 0;i<mat.length;i++){
                sums += mat[i][mat.length-1-i];
            }
            return sums;
        }
        public static int result(int mat[][]){
            int sums = rightS(mat);
            int sumr = leftS(mat);

            
            return sums+sumr;
        }
        
      
           
    
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4},
                           { 5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
       System.out.println(result(mat));;

    }
}
