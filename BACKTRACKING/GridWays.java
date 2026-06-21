public class GridWays {
    public static int  Gridways(int i, int j,int n,int m){
        if(i == n-1 && j == m-1){ // codn for last cell
            return i;
        }else if(i == n || j == n) {//boundary cross condition;
            return 0;
        }


        int w1 = Gridways(i+1,j,n,m); // down
        int w2 = Gridways(i,j+1,n,m);// right
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(Gridways(0,0,n,m));
    }

}
