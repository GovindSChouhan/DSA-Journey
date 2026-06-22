public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k) > bloomDay.length){
            return-1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<bloomDay.length;i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        for(int i = min;i<=max;i++){
            if(check(bloomDay,m,k,i))
            return i;
        }
        return -1;
    }
    public boolean check(int bloomDay[], int m , int k, int day){
        int count = 0;
        int bd = 0;
        for(int i = 0;i<bloomDay.length;i++){
            if(bloomDay[i] <= day){
                count ++;
            }else{
                bd += count/k;
                count = 0;
            }
            
        }
        bd += count/k;
        return bd >=m;
    }
    
}

 