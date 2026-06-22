import java.util.Scanner;
public class kadanes {
    public static void Array(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0;i<num.length;i++){
            cs += num[i];
              
                if(cs < 0) {
                    cs= 0;//If the current sum becomes negative, reset it to 0
            }
            ms = Math.max(cs, ms);// Update the max sum if the current sum is greater
        }
        System.out.println("max sum is "+ ms);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        Array(num);
    }
    
}
// optemize 
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = 0;
//       int max = Integer.MIN_VALUE;
//         for(int i = 0;i<nums.length;i++){
//             sum += nums[i];
            
//             max = Math.max(max, sum);
//             if(sum < 0){
//                 sum = 0;
//             }
//         }
//         return max;
//     }
// }
