public class Merge_Sort {
    static void Merge_sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to sort
        }
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, temp, 0, arr.length - 1);

        System.out.println("Merge Sort:");
        for (int element : arr) {
            System.out.print(element + "   ");
        }
    }

    private static void mergeSortHelper(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortHelper(arr, temp, low, mid);
            mergeSortHelper(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        System.arraycopy(arr, low, temp, low, high - low + 1);
        int i = low;
        int k = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }

        while (j <= high) {
            arr[k++] = temp[j++];
        }
    }

   
}
