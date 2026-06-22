public class FriendPair {
    public static int Pair(int n){
        //base
        if(n == 1 || n == 2){
            return n;
        }
        //work frindn -1
        //SINGLE
        int fnm1 = Pair(n-1);

        //PAIR
        int fmn2 = Pair(n-2);
        int pairways = (n-1) * fmn2;

        //totalWAYS
        int totlways = fnm1+ pairways;
        //return totlways;

      //  return Pair(n-1) + (n-1)*Pair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Pair(3));
    }
}
