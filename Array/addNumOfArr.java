import java.util.Scanner;
public class addNumOfArr{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int sum = 0;
        for(int i = 1;i<=arr.length;i++){
            sum = sum+i;
        }
        System.out.println("the sum is "+sum);

        
    }
}