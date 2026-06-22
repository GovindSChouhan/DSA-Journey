public class mooreAlgo {
    class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int el = 0;

        for (int num : nums) {
            if (cnt == 0) {
                el = num;
                cnt = 1;
            } else if (num == el) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return el;
    }
}

}
//
