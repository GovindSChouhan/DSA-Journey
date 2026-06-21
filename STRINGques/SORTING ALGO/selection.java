public class selection{
    public static void search(int arr[]){
        for(int i = 0;i<arr.length-1;i++){//no of terms
            int minpos = i;//cur elemt posi is min
            for(int j = i+1;j<arr.length;j++){//
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];//swap
            arr[minpos] = arr[i];
            arr[i] = temp;
        }


    }
    public static void printarr(int arr[]){//print kara rha hai
          for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        
    } 
    public static void main(String[] args) {
        int arr[] = {5,4,3,2};
        search(arr);
        printarr(arr);
    }

}