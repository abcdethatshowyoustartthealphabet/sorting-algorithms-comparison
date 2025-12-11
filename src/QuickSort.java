

public class QuickSort {

    public static void QuickSort(int[] arr) {
        QuickSort(arr,0, arr.length - 1);
    }

    public static void QuickSort(int[] arr,int start, int end) {
        int size = end - start + 1;
        if (size <= 3) {
            manualSort(arr,start, end);
        } else {
            double median = medianOfThree(arr,start, end);
            int partition = partition(arr,start, end, median);
            QuickSort(arr,start, partition - 1);
            QuickSort(arr,partition + 1, end);
        }
    }

    public static int medianOfThree(int[] arr,int left, int right) {
        if (left > right) {
            return -1;
        }
        int center = (left + right) / 2;

        if (arr[left] > arr[center]) {
            swap(arr,left, center);
        }

        if (arr[left] >arr[right]) {
            swap(arr,left, right);
        }

        if (arr[center] > arr[right]) {
            swap(arr,center, right);
        }

        swap(arr,center, right - 1);
        return arr[right - 1];
    }

    public static void swap(int[] arr,int dex1, int dex2) {
        int temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }

    public static int partition(int[] arr,int start, int end, double pivot) {
        if (start > end) {
            return -1;
        }
        int leftPtr = start;
        int rightPtr = end - 1;

        while (true) {
            while (arr[++leftPtr] < pivot)
        ;
            while (arr[--rightPtr] > pivot)
        ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(arr,leftPtr, rightPtr);
            }
        }
        swap(arr,leftPtr, end - 1);
        return leftPtr;
    }

    public static void manualSort(int[] arr,int left, int right) {
        int size = right - left + 1;
        if (size <= 1) {
            return;
        }
        if (size == 2) {
            if (arr[left] > arr[right]) {
                swap(arr,left, right);
            }
            return;
        } else {
            if (arr[left] > arr[right - 1]) {
                swap(arr,left, right - 1);
            }
            if (arr[left] > arr[right]) {
                swap(arr,left, right);
            }
            if (arr[right - 1] > arr[right]) {
                swap(arr,right - 1, right);
            }
        }
    }

  
}
