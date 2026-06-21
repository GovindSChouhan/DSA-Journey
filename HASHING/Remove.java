import java.util.*;
public class Remove{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert - o(n)
        hm.put("india",100);
        hm.put("bhatoni", 300);
        hm.put("raghoghar", 309);

        System.out.println(hm);

        //Get - o(1)
       
        //Remove;

        System.out.println(hm.remove("indonesia"));
        System.out.println(hm.remove("india"));
        System.out.println(hm);

        //size
       System.out.println(hm.size());

        //is Empty
       hm.clear();
        System.out.println(hm.isEmpty());

    }
}