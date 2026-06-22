public class insertion {
    

         public static void insert(int arr[], int n, int P, int k) {
            if (k > n || k < 0) {
                System.out.println("Invalid index");
                return;
            }
    
            // Shift elements to the right
            for (int i = n; i > k; i--) {
                arr[i] = arr[i - 1];
            }
    
            // Insert the new element
            arr[k] = P;
    
            // Print the updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int arr[] = new int[100]; // Large enough to accommodate insertions
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 5;
    
            int n = 5; // Current number of elements
            int P = 99; // Element to be inserted
            int k = 2; // Index location
    
            System.out.println("Original array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    
            insert(arr, n, P, k); // Insert element P at index k
        }
    
    
}
