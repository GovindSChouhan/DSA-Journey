import java.util.Arrays;
public class sum {
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2};
        String str[] = {"govind","singh","chouhan"};
        System.out.println("the original arr is:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("the sorrted arr is "+Arrays.toString(arr));

        System.out.println("the sorted string is :"+Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("the sorted arr is :"+Arrays.toString(str));
        Arrays.sort(str);



    }
}