
    import java.util.*;
public class Rainwtr2{
    public static int Rainwater(int arr[]){
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];

        leftMax[0] = arr[0]; 
        for(int i = 1;i<arr.length;i++){
           leftMax[i] = Math.max(leftMax[i-1] ,arr[i]);
           //System.out.print(leftMax[i]);
           
           
        }
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2;i >= 0;i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
           // System.out.print(rightMax[i]);
           
        }
        int trapped = 0;
        for(int i = 0;i<arr.length;i++){
            int waterLev = Math.min(leftMax[i] , rightMax[i]);
            trapped += waterLev - arr[i];

        }
        return trapped;
  
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
       System.out.println( Rainwater(arr));
         
    }

}
