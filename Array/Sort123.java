public class Sort123 {
    class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // count 0s, 1s, 2s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count0++;
            else if (nums[i] == 1) count1++;
            else count2++;
        }

        int idx = 0;

        // place 0s
        for (int i = 0; i < count0; i++) {
            nums[idx++] = 0;
        }

        // place 1s
        for (int i = 0; i < count1; i++) {
            nums[idx++] = 1;
        }

        // place 2s
        for (int i = 0; i < count2; i++) {
            nums[idx++] = 2;
        }
    }
}

}
//OPTEMIZE CODE 
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                // swap mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

