class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // make mid even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // single element is on the right
                start = mid + 2;
            } else {
                // single element is on the left (or mid itself)
                end = mid;
            }
        }
        return nums[start];
    }
}

    

