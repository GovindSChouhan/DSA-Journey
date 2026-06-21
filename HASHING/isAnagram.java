import java.util.*;
public class isAnagram {
    public static boolean isAnagraam(String s ,String t){
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
            //loop s ke har character ki frequency count karta 
            //hai aur HashMap me store karta hai.
            }
            for(int i = 0;i<t.length();i++){
                char ch = t.charAt(i);
            if(hm.get(ch) !=null){//ager ch hm hai tho retuen if ! then null
                if(hm.get(ch) == 1){// if frq is Exactly 1 then remove it from hm
                    hm.remove(ch);
                }else{//frq 1 say badi hai 
                    hm.put(ch, hm.get(ch)-1);//ka matlab hai ki agar us character
                    //ki frequency 1 se zyada hai, toh usko 1 se kam kar do.
                }


            }else{
                return false;
            }
        }
        return hm.isEmpty();
        
    }
    public static void main(String[] args) {
       String s = "race";
       String t = "care";

       System.out.println(isAnagraam(s,t));
       
    }   
}
