import java.util.*;
public class abhiyas{

    public static int tails(int n){
        if(n ==1 || n == 0){
            return 1;
        }
        int nm1 = tails(n-1);
        int nm2 = tails(n-2);
        int totl = nm1 + nm2;

        return totl;

    }
    
    
    public static void main(String[] args) {
        System.out.println(tails(4));

    }
}
