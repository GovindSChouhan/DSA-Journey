public class prac{
    public static int rev(int n){
        int rev = 0;
        while(n>0){
            int lastD = n%10;
            rev = (rev * 10)+lastD;
            n = n/10;
        }
        return rev;
    }
    public static boolean isPalin(int n){
        if(n == rev(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //rev(121);
      System.out.println(isPalin(121));

    }
}