import java.util.*;
public class Firstocc {
    public static int find(int arr[], int result){
        for(int i = 0;i< arr.length;i++){
           if(arr[i] == result){
            return i;
           }
             
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,};
        int result = 5;
        int idx = find(arr,result);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(idx+" ");
    }
}