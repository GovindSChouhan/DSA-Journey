import java.util.*;
public class praa{

    public static void Sum(int arr[],int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int second  = target - arr[i];
            if(map.containsKey(second)){
                System.out.println("("+map.get(second) +","+ i);
            }
            map.put(arr[i],i);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            for(int j = i+1;j<nums.length;j++){
                if(curr + nums[j] == target){
                    return new int[]{i,j};
                    

                }
            }
        }
        return new int[] {-1,-1};
    }
    


    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int target = 9;
        Sum(arr,target);
    }
}