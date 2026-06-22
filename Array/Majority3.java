class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;

        int elemnt1 = 0;
        int elemnt2 = 0;

        for(int i = 0;i<nums.length;i++){
            if(count1 == 0 && elemnt2 != nums[i]){
                count1 = 1;
                elemnt1 = nums[i];
            }else if (count2 == 0 && elemnt1 != nums[i]){
                count2 = 1;
                elemnt2 = nums[i];
            }else if (elemnt1 == nums[i]){
                count1++;
            }else if (elemnt2 == nums[i]){
                count2 ++;
            }else{
                count1--;count2--;
            }
        }count1 = 0; count2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == elemnt1){
                count1++;
            }else if(nums[i] == elemnt2){
                count2++;
            }
        } 
        List<Integer> ans = new ArrayList<>();
        if(count1 == nums.length/3+1){
            ans.add(elemnt1);
        }
        if(count2 == nums.length/3+1){
            ans.add(elemnt2);

        }

        return ans;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(ans.contains(nums[i]))continue;
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
           
            if(count >nums.length/3){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
    

