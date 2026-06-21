import java.util.*;
public class FindPermutation {
    public static void findPermu(String str, String ans){
        //// Base case: if str is empty, print the permutation (ans) and return
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
// // Recursive case: generate permutations by picking each character from str
        for(int i= 0;i<str.length();i++){
            char curr = str.charAt(i);
            //abcd =  ab + de = abde;
  //// Remove the picked character          
           String  NewStr = str.substring(0, i) + str.substring(i+1);
           findPermu(NewStr, ans+curr);// Recursively call with the remaining string and updated ans
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermu(str, " " );

    }
}
