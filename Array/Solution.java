public class Solution {
    public void rotate(int[] nums, int k) {
       k = k % nums.length;//left rotation 
       k = nums.length - k;//for right rotation
       int[] temp = new int[k];
       for(int i = 0;i<k;i++){
        temp[i] = nums[i];
       }
        //shifting 
       for(int i = k;i<nums.length;i++){
        nums[i-k] = nums[i];
       } 
       //temp k liye 
       for(int i = nums.length-k;i<nums.length;i++){
        nums[i] = temp[i-(nums.length-k)];
       }
    }
}//time o(n) , space o(d) {
    
}
