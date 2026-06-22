import java.util.*;
public class FirstOcc {
    public static int FirstOcc(int arr[] , int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       return FirstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,4};
         //int key = 4;
        System.out.println("Arrays" + Arrays.toString(arr));
        System.out.println(FirstOcc(arr,4,0));
        
    }
}
