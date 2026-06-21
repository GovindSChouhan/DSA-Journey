public class LinearGrid {
    public static long fact(int num){
        long fact = 1;
        for(int i = 1;i<=num;i++){
            fact*= i;
        }
        return fact;
    }
    public static long gridWays(int n, int m){
        int totalSteps = (n-1) + (m-1);
        int down  = n-1;
        int right = m-1;

        return fact(totalSteps) / (fact(down) * fact(right));
    }
   public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total ways : " +gridWays(n,m));
    }
}
//public class LinearGrid {
    public static long binomialCoefficient(int n, int k) {
        long res = 1;
        if (k > n - k) k = n - k; // Use smaller k to reduce calculations
        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static long gridWays(int n, int m) {
        return binomialCoefficient(n + m - 2, n - 1);
    }







