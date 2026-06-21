import java.util.*;
public class HhashSet{
    public static void main(String[] args) {
        IterationOnHashSet<Integer> hs =new IterationOnHashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        
        System.out.println(hs);
        hs.remove(2);
        if(hs.contains(2)){
            System.out.println("has 2 ");

        }
        if(hs.contains(100)){
            System.out.println(" has 100");
        }
        System.out.println("size is "+hs.size());

       // hs.clear();
      //  System.out.println(hs.size());
      //  System.out.println(hs.isEmpty());
    }

}
