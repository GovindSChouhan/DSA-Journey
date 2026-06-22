import java.util.Scanner;
public class largestArray{
public static int largestNum(int num[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int i =0;i<num.length;i++){
        if(largest < num[i]){
            largest = num[i];

        }
       if(smallest > num[i]){
           smallest = num[i];
        }
    }
    return largest;
}
public static void main(String[] args) {
    int num[] = {1,3,9,7,5};
    int largest = largestNum(num);
    System.out.println("largest value is  "+largest);

}
}