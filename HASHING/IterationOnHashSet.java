import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("auna");
        hs.add("pao");
        hs.add("kovindPura");
         hs.add("dovindPura");

       Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

            
        }
        for(String  gov: hs){
            System.out.println(gov);
        }
        //LINKEDHASHSET
        

    }
}
