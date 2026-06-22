import java.util.*;
class Solution {
    public int maxi(int piles[]){
        int max = Integer.MIN_VALUE;
       for(int i = 0;i<piles.length;i++){
          max = Math.max(max,piles[i]);


        }
        return max;
    }
    public int timerequired(int piles[],int hour){
        int houri =0;
        for(int i = 0;i<piles.length;i++){
            houri += (int)Math.ceil((double)piles[i]/hour);

        }
        return houri;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = maxi(piles);
        for(int i = 1;i<maxi;i++){
            int timereq = timerequired(piles,i);
            if(timereq <= h){
                return i;
            }

        }
        return maxi;
    }
}class Solution {
    public long timerequired(int piles[],int  mid){
        long timei = 0;

        for(int i = 0;i<piles.length;i++){
            timei += (int)Math.ceil((double)piles[i]/(double)mid );

        }
        return timei;
    }
    public int maxi(int piles[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
         int start = 1;
         int  end = maxi(piles);

        while(start <= end){
            int mid = (start+end)/2; c
            long timerequired = timerequired(piles,mid);
            if(timerequired <= h){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
    
}
