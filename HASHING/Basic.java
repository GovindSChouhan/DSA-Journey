import java.util.*;
public class Basic{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert - o(n)
        hm.put("india",100);
        hm.put("bhatoni", 300);
        hm.put("raghoghar", 309);

        System.out.println(hm);

        //Get - o(1)
        int population = hm.get("india");
        System.out.println(population);

        System.out.println(hm.get("bhatoni"));

        //ContainaKey
        System.out.println(hm.containsKey("india")); //t
        System.out.println("Gail");                  //f

        //Remove;



    }
}