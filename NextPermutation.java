public class NextPermutation {
   
     static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the element just larger than arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Step 3: Swap them
            swap(arr, i, j);
        }

        // Step 4: Reverse the remaining subarray
        reverse(arr, i + 1, n - 1);
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};

        nextPermutation(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
