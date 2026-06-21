public class bubble {
    public static void bubbles(int arr[]){
        for(int i = 0;i<arr.length-1;i++){//Outer Loop: Runs n - 1 times, where n is the length of the array.

            for(int j = 0;j<arr.length-1-i;j++){//Runs fewer times on each subsequent pass (i.e., n - 1 - i times), as the largest elements are sorted and moved to the end of the array.
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,5,3,1,6};
        bubbles(arr);
        printarr(arr);
    }
}
