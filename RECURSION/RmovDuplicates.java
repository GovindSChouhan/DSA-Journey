import java.util.*;
public class RmovDuplicates{
    public static void duplicates(String str , int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){// base case;
            System.out.println(newStr);
            return;
        }
        
        char currChar = str.charAt(idx);//jis bhi index per hu uss per jo bhi char hai usyy curr char mai store kara diya
        if(map[currChar-'a'] == true){//[currChar-'a']mean index nikal gya.
            
            //duplicates
            duplicates(str, idx+1, newStr, map);

        }else{
            map[currChar-'a'] = true;
            duplicates(str,idx+1,newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "goovvind";
        // boolean map[] = new boolean[26];
        duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

}
//new code smae 
public class abhiyas {

    public static void removeDup(String str, int idx, StringBuilder result, boolean map[]){

        // 1️⃣ Base Case
        if(idx == str.length()){
            System.out.println(result);
            return;
        }

        // 2️⃣ Kaam
        char ch = str.charAt(idx);

        if(map[ch - 'a'] == true){
            // already seen → skip
            removeDup(str, idx + 1, result, map);
        } else {
            // not seen → include
            map[ch - 'a'] = true;
            result.append(ch);
            removeDup(str, idx + 1, result, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean map[] = new boolean[26];

        removeDup(str, 0, new StringBuilder(""), map);
    }
}