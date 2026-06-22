class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIdx = firstIdx(nums,target);
        int secondIdx = secondIdx(nums,target);

        if(firstIdx == -1){
            return new int[] {-1,-1};
        }
        return new int[] {firstIdx, secondIdx};
    }
    public static int firstIdx(int nums[] ,int target){
        int start = 0;
        int end = nums.length-1;
        int firstId = -1;
        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                firstId = mid;
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return firstId;
    }
    public static int secondIdx(int nums[] ,int target){
        int start = 0;
        int end = nums.length-1;
        int secondId = -1;
        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                secondId = mid;
                start = mid + 1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
       return secondId;
    }
}
    

