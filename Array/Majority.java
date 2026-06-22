public class Majority.elmnt {
    
    public int majorityElement(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count ++;
                }

            }if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
//optemize up o(n^2) and o(1)while this o(n) and o(1);
// import java.util.*;
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer , Integer>map = new HashMap<>();
//         for(int i = 0;i<nums.length;i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
//             if(map.get(nums[i]) > nums.length/2){
//             return nums[i];
//         }

//         }
//         return -1;
//     }
// }//THEN COME OUR MOORE ALGO o(n ) and o(1)

