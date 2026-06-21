public class Merge2 {
    public static void conquer(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store the merged subarrays
        int merged[] = new int[ei - si + 1];

        int indx1 = si; // trace first subarray
        int indx2 = mid + 1; // trace second subarray

        int x = 0; // index for merged array

        // Merge the two sorted subarrays
        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        // If there are any remaining elements in the first subarray
        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }

        // If there are any remaining elements in the second subarray
        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }

        // Copy the merged subarray back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            // If there is only one element or no elements to sort, return
            return;
        }

        // Find the mid-point of the current array
        int mid = si + (ei - si) / 2;

        // Recursively divide the array into two halves
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        // Merge the sorted part
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        
        // Call the divide function to start the merge sort process
        divide(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
