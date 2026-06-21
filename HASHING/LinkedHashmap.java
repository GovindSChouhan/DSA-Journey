import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer>lhm = new LinkedHashMap<>();
        lhm.put("india" , 100);
        lhm.put("china", 150);
        lhm.put("US", 50);

        //Compare function.
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india" , 100);
        hm.put("china", 150);
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(lhm);
        
    }
}
