public class Qick2 {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // choosing the last element as the pivot
        int i = low - 1; // pointer for the smaller element

        for (int j = low; j < high; j++) { // traverse the array from low to high-1
            if (arr[j] < pivot) { // if the current element is smaller than the pivot
                i++; // move the pointer for the smaller element forward

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
        }
        // swap arr[i+1] and pivot (arr[high]) to place the pivot in the correct position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // return the partition index
    }

    public static void search(int arr[], int low, int high) {
        if (low < high) { // recursive case for quicksort
            int pindx = partition(arr, low, high); // partition the array

            // recursively sort the elements before and after partition
            search(arr, low, pindx - 1);
            search(arr, pindx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8}; // sample array
        int n = arr.length;
        search(arr, 0, n - 1); // apply quicksort

        // print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

     

