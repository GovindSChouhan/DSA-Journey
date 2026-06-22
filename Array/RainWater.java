import java.util.Scanner;
public class RainWater {
    public static int Water(int height[]){ 
        int n = height.length;

        //calculate left max boundary - array
        int leftMax[] = new int [n];
        leftMax[0] = height[0];//bcozz 1sr has 0 element on the left.
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);//current height ko compare kr rhe hai left height se.
        }
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--) {
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i = 0;i<n;i++){
            //waterlevel 
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trappedWater
            trappedWater += waterLevel - height[i];// we are adding the trapped water above the current bar to the total trapped water calculated so fa

        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(Water(height));
    }
}
