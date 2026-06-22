public class SubarrySumeqlK {
    public static int  subarr(int nums[],int target){
        int sum = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
             sum = 0;
            for(int j = i;j<nums.length;j++){
               
               
                    
                    sum += nums[j];
                    if(sum == target){
                        count++;
                    }
                
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1};
        int target = 2;
        System.out.println(subarr(nums,target));

        
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];//caclu prefix
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j = 0;j<nums.length;j++){
            int value = prefix[j] - k;
            
            if(map.containsKey(value)){
                count += map.get(value);
            }
          map.put(prefix[j], map.getOrDefault(prefix[j], 0) + 1);

        }
        return count ;
       
    }
}
