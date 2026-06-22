import java.util.*;
public class praa {
    public static int ThreeSum(int arr[]){
        int target = 0;
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            target = -arr[i];
            for(int j = i+1;j<arr.length;j++){
                result = target - arr[j];
                
            }
        }
        return result;
    }
   

public static void treesum(int arr[]) {
     int n = arr.length;
        Set<String> unique = new HashSet<>();

        for (int i = 0; i < n; i++) {
            HashSet<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int need = -arr[i] - arr[j];

                if (seen.contains(need)) {
                    int[] triplet = {arr[i], arr[j], need};
                    Arrays.sort(triplet); // to avoid duplicates

                    String key = triplet[0] + "," + triplet[1] + "," + triplet[2];
                    if (!unique.contains(key)) {
                        unique.add(key);
                        System.out.println(key);
                    }
                }
                seen.add(arr[j]);
            }
        }
    }

   
   


    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println(ThreeSum(arr));
        treesum(arr);
        
    }
}
