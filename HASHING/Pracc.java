import java.util.*;
public class Pracc {
    public static void main(String[] args) {
        int arr[] = {0};
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        
        for (int j = 0;j<arr.length;j++){
            sum = sum+arr[j];
           if(map.containsKey(sum)){
              len = Math.max(len, j-map.get(sum));

            }else{
                map.put(sum,j);
            }
        }
        System.out.println("largest subarr with sum 0 :"+len);
    }
}
