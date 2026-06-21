public class bubbleOptmize {
   
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;
    
            // Outer loop for number of passes
            for (int i = 0; i < n - 1; i++) {
                swapped = false;  // Initialize swapped as false for each pass
    
                // Inner loop for comparing adjacent elements
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap if elements are in the wrong order
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;  // Set swapped to true since we did a swap
                    }
                }
    
                // If no elements were swapped, the array is already sorted
                if (!swapped) {
                    break;
                }
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
    
            System.out.println("Original array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
    
            bubbleSort(arr);
    
            System.out.println("\nSorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    
    
}
