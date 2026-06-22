import java.util.Scanner;
public class maxSubarray{
    public static void array(int num[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<num.length;i++){
            int start = i;
            for(int j = i;j<num.length;j++){
                int end = j;
                curr = 0;
                for(int k = start ;k<=end;k++){
                    curr += num[k];
                }
                System.out.println(curr);
                 if(max < curr){
                    max = curr;
                }
            }
        }
        System.out.println("the max sum is "+max);
    }
   public static void main(String[] args) {
      int num[] = {1,-2,6,-1,3};
       array( num);
    }
}