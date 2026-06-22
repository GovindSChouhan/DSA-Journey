//  import java.util.*;
// public class LongestConce {
   
//     public static boolean linearSearch(int[] a, int num) {
//         int n = a.length;
//         for (int i = 0; i < n; i++) {
//             if (a[i] == num)
//                 return true;
//         }
//         return false;
//     }

//     public static int longestConsecutive(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }

//         int n = nums.length;
//         int longest = 1;

//         for (int i = 0; i < n; i++) {
//             int x = nums[i];
//             int cnt = 1;

//             while (linearSearch(nums, x + 1)) {
//                 x += 1;
//                 cnt += 1;
//             }

//             longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int[] a = {100, 4, 200, 1, 3, 2};
//        // Solution solution = new Solution();
//         int ans = longestConsecutive(a);
//         System.out.println(ans);
//     }
// }
import java.util.*;

class Solution {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 1;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int idx = m+n-1;
//         int i = m-1;
//         int j = n-2;

//        while( i>= 0 && j>= 0){
//         if(nums1[i] > nums2[j]){
//             nums1[idx]= nums2[i];
//             i--,idx--;
//         }else{
//             nums1[idx] = nums2[j];
//             j--;idx--;
//         }

//         while(j>= 0){
//             nums1[idx] = nums2[j];
//             j--;idx--;
//         }
//        }
//     }
// }



