import java.util.*;
public class FindIteranryTikat {
    public static String StartingPoint(HashMap<String, String>tickets){//from  say to  
        HashMap<String ,String> revmap = new HashMap<>();//to say from ka data banana hai

        for(String key : tickets.keySet()){//ek ek ky per loop
            revmap.put(tickets.get(key),key);//1st valueas a key then key as value
        }
        for(String key : tickets.keySet()){
           if(!revmap.containsKey(key)){
             return key;

            }
        }
        return null;
    }
    public static void main(String[] args) {


        HashMap<String, String > tickets = new HashMap<>();
         // from → to
        tickets.put("chennai","bengluru");
        tickets.put("mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");

        String start = StartingPoint(tickets);
        System.out.println(start);
        for(String key :tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
            
        }
       for(String key : tickets.keySet()){
        System.out.println("->"+tickets.get(start));
        start = tickets.get(start);

        
       }

        




    }
}
