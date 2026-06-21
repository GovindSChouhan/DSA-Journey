import java.util.*;
public class Indian_Coin {
        public static void main(String[] args) {
            int amount = 590;
            Integer coin[] = {1,2,5,10,20,50,100,500,2000};
            Arrays.sort(coin, Comparator.reverseOrder());

            int count = 0;
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0;i<coin.length;i++){
                if(coin[i] <= amount){
                    while(coin[i] <= amount){
                        count++;
                        ans.add(coin[i]);
                        amount = amount - coin[i];

                    }

                }
            }
            System.out.println("total min coin used is : +"+count );
            //to print the used coin.

            for(int i = 0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }
        System.out.println();
    }    
    
}
