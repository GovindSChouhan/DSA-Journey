import java.util.Arrays;
public class maxnmin{
    static int max;
    static int min;
    public static void max_min(int arr[]){
        max = arr[0];
        min = arr[0];
        int len = arr.length;

        // Iterate through the array in pairs.
        for(int i =1;i<len-1;i = i+1){

             // Check if there's only one element left in the pair.
            if(i+1 > len){
            if(arr[i]  > max)max = arr[i];
            if(arr[i] < min)min = arr[i];
        }

          // Compare and update max and min within the pair of elements.
         // Compare and Update Max and Min for Pair 1:
        if(arr[i] > arr[i+1]){
            if(arr[i] > max )max = arr[i];
            if(arr[i] < min) min = arr[i+1];
        }
         //Compare and Update Max and Min for Pair 2:
        if(arr[i] < arr[i+1]){
            if(arr[i] < min)min = arr[i];
            if(arr[i] > max)max = arr[i+1];
        }
    }

    }
    public static void main(String[] args) {
        int arr[] = {23,2,42,52,62,7,1,67};
        max_min(arr);
        System.out.println("original arry"+Arrays.toString(arr));

        System.out.println("max is "+max);
        System.out.println("min::"+min);
    }
}