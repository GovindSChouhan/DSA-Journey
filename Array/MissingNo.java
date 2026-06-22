import java.util.*;
public class MissingNo {
   
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int original_sum = n*(n+1)/2;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
        }
        return original_sum - sum;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,4,5};
        System.out.println(missingNumber(nums));

        

    }
}
