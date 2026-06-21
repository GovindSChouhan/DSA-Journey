import java.util.*;
public class PrintNonRepeating{
    public static void NonRepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0;i < str.length();i++){   // Step-by-step character
            char ch = str.charAt(i);              
            q.add(ch);        //                     // Add character to queue
            freq[ch-'a']++;                        // Increase frequency

            while(!q.isEmpty() && freq[q.peek()-'a'] >1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek()+" ");
            }
        }
       System.out.println();

    }
    public static void main(String[] args) {
        String str = "aabccxb";
        NonRepeating(str);
    }
    
}