public class Subarray_pair{  
  public static void subarr(int arr[]){
           for(int i = 0;i<arr.length;i++){
                int current = arr[i];
                for(int j = i+1;j<arr.length;j++){
                    System.out.print("("+current +","+arr[j]+")");
                    System.out.print(",");
                }

            }
        }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8 };
        subarr(arr);
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }

       
    }
}    