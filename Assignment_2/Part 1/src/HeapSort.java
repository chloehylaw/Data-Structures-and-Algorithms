import java.util.Arrays;

public class HeapSort {
    public void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int[] A, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && A[l] > A[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && A[r] > A[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = A[i];
            A[i] = A[largest];
            A[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(A, n, largest);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr ={60,35,81,98,14,47};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");      // 14 35 47 60 81 98
        System.out.println(Arrays.toString(arr));
    }
}
