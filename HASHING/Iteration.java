import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("china",150);
        hm.put("badotha",200);
        hm.put("killy",390);


        //iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        //foreach Loop
        for(String k:keys){
          System.out.println("key="+k+",value="+hm.get(k));

        }   
       

    
    }
    
}
