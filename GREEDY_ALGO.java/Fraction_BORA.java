import java.util.*;

public class Fraction_BORA {
    public static void main(String[] args){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double  ratio[][] = new double[val.length][2];
        for(int i = 0;i<val.length;i++){

            //0 col = idx and 1st col = ratio
            ratio[i][0] = i;
            ratio[i][1] = val[i]/ (double)weight[i];

        }
        //acc
        int capacity = W;
        int finalVal = 0;
        Arrays.sort(ratio,Comparator.comparing(o ->o[1]));
        
        for(int i = ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];//heighest ratio ka idx
            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];

            }else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;

            }
        }
        System.out.println("final value = "+ finalVal);
    }
}
