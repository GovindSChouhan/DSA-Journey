import java.util.*;
public class prac{
    public static void palin(int n){
        int rev = 0;
       for(int i = n;i>0;i=i/10){
        int ld = i%10;
        rev = (rev*10)+ld;

       }
       if(n == rev){
        System.out.println("no is panin");

       }else{
        System.out.println("no");
       }

        
    }
    public static void main(String[] args) {
        int n = 121;
        palin(n);
    }
}