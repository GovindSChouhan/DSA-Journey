import java.util.*;
public class prac{
    public static boolean isPrime(int n){

        if(n == 2 || n <=1){
            return false;
        }
        for(int i = 2;i<n-1;i++){
            if(n%i == 0){
              //  System.out.println("num is not prime ");
                return false;
            }
              

            

        }
        return true;
     
    }
    public static void main(String[] args) {
        System.out.println(isPrime(0));
    }
}