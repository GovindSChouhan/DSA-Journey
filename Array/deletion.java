public class deletion {
   // public class ArrayOperations {

        public static void delete(int arr[], int n, int k) {
            if (k >= n || k < 0) {
                System.out.println("Invalid index");
                return;
            }
    
            // Shift elements to the left
            for (int i = k; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
    
            // Print the updated array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5}; // Initial array
            int n = 5; // Current number of elements
            int k = 2; // Index to be deleted
    
            System.out.println("Original array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    
            delete(arr, n, k); // Delete element at index k
        }
   // }
    
}
