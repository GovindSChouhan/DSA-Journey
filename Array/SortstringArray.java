import java.util.Arrays;
public class SortstringArray{
    public static void main(String[] args) {
        int num[]  = {123,5,678,987,34,667,89,90087,55};
        String arr[] =  {"govi","govin","go","gov","govind"};
        System.out.println("original array is :"+Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("sorted aray:"+Arrays.toString(num));
        System.out.println();
        
        System.out.println("original array:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("original array:"+Arrays.toString(arr));;
    }
}