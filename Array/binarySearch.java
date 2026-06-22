import java.util.Scanner;

public class binarySearch {
    // Function to perform binary search
    public static int binary(int[] arr, int key) {
        int start  = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid =(start + end) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found at index mid
            }

            // If key is greater, ignore left half///right 
            if (arr[mid] < key) {
                start = mid + 1;
            }
            // If key is smaller, ignore right half..left 
            else {
                end = mid - 1;
            }
        }

        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array (must be sorted)
        int[] arr = {2, 3, 4, 10, 40};
        
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform binary search
        int result = binary(arr, key);

        // Output the result
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();

    }
}
