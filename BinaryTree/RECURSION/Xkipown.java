
public class Xkipown {
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        //return x*pow(x,n-1);
        int xpownm1 = pow(x,n-1);
        int xpow = x*xpownm1;
        return xpow; 
    }
    public static void main(String[] args) {
        
        System.out.println(pow(2,10));
    }

}
