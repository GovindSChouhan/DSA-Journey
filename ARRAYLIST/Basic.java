
import java.util.ArrayList;
public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);//o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //list.add(1, 9); //o(n);

        System.out.println(list);

        //get operation // o(1)
        int element = list.get(2);
       // System.out.println(element);

        //DLETE;
        list.remove(2);
      //  System.out.println(list);

        //Set 
        list.set(2,10);
       // System.out.println(list);

        //Contains.
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }

}

