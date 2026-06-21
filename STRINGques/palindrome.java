import java.util.Scanner;
public class palindrome {
    public static boolean ispalindrome(String str){
        for(int i = 0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) !=str.charAt(n-1-i)){//(n-1-i)mean last elemnt of the string
                return false;
            }
        }
       return true;
    } 
    public static void main(String[] args) {
        String str = "raecear";//moon,madam
        System.out.println(ispalindrome(str));
    }
}
