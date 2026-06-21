public class prac{
    public static int prime(int n){
       
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;

        }
        return fact;
    
       

    }
    public static void rev(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;    
        }
        
       
    }
     public static void subarr(int arr[]){
           for(int i = 0;i<arr.length;i++){
                int current = arr[i];
                for(int j = i+1;j<arr.length;j++){
                    System.out.print("("+current +","+arr[j]+")");
                    System.out.print(",");
                }

            }
        }
        public static int  larg(int arr[]){
            int lar = Integer.MAX_VALUE;

            for(int i = 0;i<arr.length;i++){
                if(lar > arr[i]){
                    lar = arr[i];
                }
            }
            return lar;
        }
        public static void revv(int arr[]){
            
            for(int i = arr.length-1;i>= 0;i--){
                System.out.println(arr[i]);
            }
        }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8 };
       System.out.println(larg(arr));
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        revv(arr);

       
    }
}