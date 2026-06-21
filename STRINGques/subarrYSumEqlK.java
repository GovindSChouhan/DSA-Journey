public class subarrYSumEqlK {
    
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int prefix[] = new int [nums.length];
        prefix[0] = nums[0];

        for(int i = 1 ; i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int j = 0;j<nums.length;j++){
            int need = prefix[j]-k;

            if(map.containsKey(need)){
                count +=map.get(need);
            }
            map.put(prefix[j], map.getOrDefault(prefix[j] ,0 )+1);
        }
        return count;
    }
}