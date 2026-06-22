import java.util.*;
public class FriendPairing {
    public static int friendspairing(int n){
        if(n == 1 || n==2){
            return n;
        }
        //single
        int fnm1 = friendspairing(n-1);

        //pair
        int fnm2 = friendspairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays;
        int totalWays = fnm1 + pairWays;
        return totalWays;

        //return friendsPairing(n-1) +(n-1)* friendsPairing(n-2)


    }
    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }
}
