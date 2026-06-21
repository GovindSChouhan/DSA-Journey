import java.util.*;
public class LHSandTreeeSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("biaora");
        lhs.add("aron");
        lhs.add("zenp");
        lhs.add("xeno");

        //lhs.remove("india");
       

        System.out.println(lhs);

        //for( String gov : lhs){
        //    System.out.println(gov);
       // }
        TreeSet<String> ts = new TreeSet<>();
        ts.add("biaora");
        ts.add("aron");
        ts.add("zenp");
        ts.add("xeno");


        System.out.println(ts);
    }
    
}
