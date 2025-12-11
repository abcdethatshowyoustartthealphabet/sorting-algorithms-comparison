

public class MergeSort {

    public static void mergeSort(int arr[]) {

        if (arr.length == 0 || arr==null) {
            return;
        }
        mergeSort(arr, 0, arr.length-1, new int[arr.length]);

    }

    private static void mergeSort(int arr[], int start, int end, int[] temp) {
        if (start < end) {
           
            int middle = start + (end - start) / 2;

            
            mergeSort(arr, start, middle, temp);
            mergeSort(arr, middle + 1, end, temp);

           
            merge(arr, start, middle, end, temp);
        }
    }

   static void merge(int arr[], int start, int middle, int end, int[] temp) {
       
       for (int i = start; i <= end; i++) {
            temp[i] = arr[i];
        }

        int i = start;
        int j = middle + 1;
        int k = start;
        
         while (i <= middle && j <= end) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        
        while (i <= middle) {
            arr[k] = temp[i];
            k++;
            i++;
        }
       
        while (j <= end) {
            arr[k] = temp[j];
            k++;
            j++;
        }
    }
     public static void mergeSortInefficient(int arr[]) {

        if (arr.length == 0) {
            return;
        }
        mergeSortInefficient(arr, 0, arr.length-1);

    }

   private static void mergeSortInefficient(int arr[], int l, int r)
    {
        if (l < r) {
          
            int m =l+ (r-l)/2;
 
            mergeSortInefficient(arr, l, m);
            mergeSortInefficient(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
   static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        
        int i = 0, j = 0;
 
       
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
       
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
       
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
 
}
