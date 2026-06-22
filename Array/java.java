import java.util.Scanner;
public class java{
    public static void insert(int arr[],int n,int k){
        if (k> n|| k<0){
            System.out.println("invalid index");
        }
        for(int i = k;i<n-1;i++){// lest shift 
            arr[i] = arr[i+1];
            
        }
       // arr[k] = p;
        System.out.println("after insertion");
        for(int i = 0;i<=n;i++){
            System.out.println(arr[i] + " ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};

        int n = 5; // Current number of elements
      //  int P = 99; // Element to be inserted
        int k = 2; 

        System.out.println("b4 insertion");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        insert(arr, n, k);

    }
}