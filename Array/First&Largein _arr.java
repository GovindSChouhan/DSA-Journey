import java.util.*;
public class praaa{

    public static int[] searchRange(int[] arr,int target ){
        int firstIdx = firs(arr,target);
        int lastIdx = last(arr, target);

        if(firstIdx == -1){
            return new int[]{-1,-1};
        }
        return new int[]{firstIdx, lastIdx};
    }
    public static int firs(int arr[],int target){
        int start  = 0;
        int end = arr.length-1;
        int first = -1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                first= mid;
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return first;
    }
        public static int last(int arr[],int target){
        int start  = 0;
        int end = arr.length-1;
        int last = -1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                last = mid;
                start = mid+1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int arr[] = {2,8,8,8,8,8,11,13};
        int  target= 8;

        System.out.println(Arrays.toString(searchRange(arr, target)));

        // int firstidx = firs(arr,target);
        // int lastidx = last(arr,target);

        // System.out.println("First Idx :"+firstidx);
        // System.out.println("last indx:"+lastidx);

        // if(firstidx != -1){
        //     System.out.println("value :"+ arr[firstidx]);
        //     System.out.println("value :"+arr[lastidx]);
        // }

        //System.out.println(Linear(nums,key));
    //   System.out.println(firs(nums, key));
    //    System.out.println(last(nums, key));
    }
}

//LEETCODE FINAL 19/1/26
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int firstIdx = firstIdx(nums,target);
//         int secondIdx = secondIdx(nums,target);

//         if(firstIdx == -1){
//             return new int[] {-1,-1};
//         }
//         return new int[] {firstIdx, secondIdx};
//     }
//     public static int firstIdx(int nums[] ,int target){
//         int start = 0;
//         int end = nums.length-1;
//         int firstId = -1;
//         while(start <= end){
//             int mid = (start + end)/2;

//             if(nums[mid] == target){
//                 firstId = mid;
//                 end = mid -1;
//             }else if(nums[mid] < target){
//                 start = mid+1;
//             }else{
//                 end = mid -1;
//             }
//         }
//         return firstId;
//     }
//     public static int secondIdx(int nums[] ,int target){
//         int start = 0;
//         int end = nums.length-1;
//         int secondId = -1;
//         while(start <= end){
//             int mid = (start + end)/2;

//             if(nums[mid] == target){
//                 secondId = mid;
//                 start = mid + 1;
//             }else if(nums[mid] < target){
//                 start = mid+1;
//             }else{
//                 end = mid -1;
//             }
//         }
//         return secondId;
//     }
// }