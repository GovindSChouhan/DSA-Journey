class leetcode{
    public static long MOD = 1_00_000_007;
    public static int countGoodnum(long n){
        long odd = n/2;
        long even = (n+1) /2;

        return (int)(pow(5, even)*pow(4,odd) %MOD);
    }
    public static long pow(long x , long n){
        if(n == 0){
            return 1;
        }
        long temp = pow(x,n/2);

        if(n%2 == 0){
            return(temp * temp) % MOD;
        }else{
            return (x * temp * temp) % MOD;
        }

    }
    public static void main(String[] args) {
        int n = 4;
       int result = countGoodnum(n);
       System.out.println("totol no of good digit " + result);
    }
}