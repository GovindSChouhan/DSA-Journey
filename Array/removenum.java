import java.util.Arrays;
import java.util.Scanner;
public class removenum{
    public static void main(String[] args) {
        int arr[] = {12,13,1,4,123,145,44};
        System.out.println("original arr:"+Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("remove value:");
        int remove = sc.nextInt();
        // int remove = 1;
        for(int i= remove;i<arr.length-1;i++){
            arr[i] = arr[i+1];//This line shifts each element one position to the left, starting from the remove index.
        }
        System.out.println("after remove the second "+Arrays.toString(arr));
    }
} 