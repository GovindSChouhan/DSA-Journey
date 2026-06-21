public class quickSort {
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];//first,,is algo mai last lee rhe hai 
        int i = low-1;//is ka kaam hai yee track karna ki pivot se
                        //kiny chote elemt aayenge aarr mai
                        //1. abhi man rhe hai ki pivot sy chota koi elemt nhi hai 

        for(int j = low;j<high;j++){//last elemnt k liye loop nhi chal rha hai
                                    //usky phaly jo  elmnt hai unky liye chal  rha hai
            if(arr[j] < pivot){//pivot ky kaam value mil jaye then usy age dal denge 
                i++;//i khali jga hai jha small emnt dal rhe hai 

                //swap
                int temp = arr[i];//chota ,pada swap 
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;//pivot sy chote elmt tho sahi jgha aa gye ab pivot ko sahi  jgha le laengy
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;//pivot index
        return i;

    }

    public static void search(int arr[],int low,int high){
        if(low<high){//case to implement quick Sort
            int pindx = partition(arr,low,high);//yee partision kr dega

            search(arr,low,pindx-1);//pivd ka index se choty
            search(arr,high,pindx+1);// pivd se pade elmt ,bade elmt k liye

        }
    }
    public static void main(String[] args) {
        int arr[]  = {6,3,9,5,2,8};
        int n = arr.length;
        search(arr,0,n-1);

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
