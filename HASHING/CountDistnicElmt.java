import java.util.*;
public class CountDistnicElmt {
    public static void main(String[] args) { 
    
      int num[] = {4,3,2,5,6,7,5,3,2,1};
       HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<num.length;i++){
            hs.add(num[i]);
        }
        System.out.println("ans = "+hs.size());
    }    
        
}
