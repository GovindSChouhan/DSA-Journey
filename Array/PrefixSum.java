import java.util.Scanner;
public class PrefixSum {
    public static void Array(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];//defined array k equal

        prefix[0] = num[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + num[i];
        }  
        for(int i = 0;i<num.length;i++){

          
            int start = i;
         //   currSum = 0;
            for(int j = i;j<num.length;j++){
                int end = j;
                currSum = start == 0? prefix[end] :  prefix[end] - prefix[start -1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
                
            }
        }
        
        System.out.println("max sum "+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        Array(num);
    }
    
}
