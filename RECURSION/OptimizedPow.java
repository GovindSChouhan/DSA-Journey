public class OptimizedPow {
    public static int opteMiz(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = opteMiz(x,n/2);
        int halfPowSq = halfPow * halfPow;

        //n is odd;
        if(n% 2 != 0){
            halfPowSq = x * halfPowSq;

        }
        return halfPowSq;

    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(opteMiz(x,n));

    }
}
