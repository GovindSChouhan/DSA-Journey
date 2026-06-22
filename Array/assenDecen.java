import java.util.Arrays;
public class assenDecen {
    public static void main(String[] args){
        int arr[] = {19,37,39,42,43,45,40,34,61,66};
        System.out.println("orginal Arr"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted arr"+Arrays.toString(arr));
    }
}
