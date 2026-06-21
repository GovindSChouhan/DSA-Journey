public class insertion {
    public static void Search(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;//i-1 = 0
            //find the correct position
            //change the cond and get the ans in decending
            while (prev >=0 && arr[prev] > curr){//prev element curr elemnt se bade hai tb tk piche push karna hai 
                arr[prev+1] = arr[prev]; //Move the prev element one step forward: arr[prev + 1] = arr[prev].
                prev--;//1.arr[0] = 5,curr=4;
            }
            //insertion

            arr[prev+1] = curr;

        }
    }
        public static void printarr(int arr[]){
            for(int i = 0;i<arr.length;i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
           
        }
      
        
    
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        Search(arr);
        printarr(arr);
    }

}
