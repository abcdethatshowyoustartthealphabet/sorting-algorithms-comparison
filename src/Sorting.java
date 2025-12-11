
package sorting;

import java.util.Scanner;

public class Sorting {

    /**
     * *****************************************************************
     * arithmeticMean
     *
     * Purpose: Compute the average of long values. To avoid long overflow, use
     * type double in the computation.
     *
     *****************************************************************
     */
    public static double arithmeticMean(long data[]) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += (double) data[i];
        }
        return sum / (double) data.length;
    } // end arithmeticMean 

    public static void testingMethod(int size, int run){
        
        int[] arr=new int[size];
        Methods.fillArray(arr);
        long[] time=new long[100];
       
         System.out.println("Number of swaps are: "+arr.length*0.25);
        //Quick Sort
        for (int i=0;i<run;i++){
        System.out.println("\n*********************** Quick Sorting ****************************");
        Methods.shuffleArray(arr, (int) (arr.length*0.25));
        System.out.println("\nBefore Quick sort\n"+printArray(arr));
        long nanoTime = System.nanoTime();
        QuickSort.QuickSort(arr);
        long nanoTime1 = System.nanoTime();
        System.out.println("\nAfter Quick sort\n"+printArray(arr));
        System.out.println("Sorted: "+Methods.isSorted(arr));
         System.out.println("Total Time Taken: "+((nanoTime1-nanoTime)/1000000.0)+"ms");
         time[i]=(nanoTime1-nanoTime);
        System.out.println("*****************************************************************");
        
        }
        System.out.println("Arthematic Mean of Quick Sort: "+Sorting.arithmeticMean(time)/1000000.0+"ms");
        // Efficient Merge Sort
        for (int i=0;i<run;i++){
        System.out.println("\n*******************Efficient Merge Sorting *********************");
        Methods.shuffleArray(arr, (int) (arr.length*0.25));
        System.out.println("\nBefore Efficient Merge sort\n"+printArray(arr));
        long nanoTime = System.nanoTime();
        MergeSort.mergeSort(arr);
        long nanoTime1 = System.nanoTime();
        System.out.println("\nAfter Efficient Merge sort\n"+printArray(arr));
        System.out.println("Sorted: "+Methods.isSorted(arr));
         System.out.println("Total Time Taken: "+(nanoTime1-nanoTime)/1000000.0+"ms");
         time[i]=(nanoTime1-nanoTime);
         System.out.println("*****************************************************************");
        
        }
        System.out.println("Arthematic Mean of Efficient Merge Sort: "+Sorting.arithmeticMean(time)/1000000.0+"ms");
      
        // InEfficient Merge Sort
        for (int i=0;i<run;i++){
        System.out.println("\n*******************InEfficient Merge Sorting *********************");
        Methods.shuffleArray(arr, (int) (arr.length*0.25));
        System.out.println("\nBefore InEfficient Merge sort\n"+printArray(arr));
        long nanoTime = System.nanoTime();
        MergeSort.mergeSortInefficient(arr);
        long nanoTime1 = System.nanoTime();
        System.out.println("\nAfter InEfficient Merge sort\n"+printArray(arr));
        System.out.println("Sorted: "+Methods.isSorted(arr));
         System.out.println("Total Time Taken: "+(nanoTime1-nanoTime)/1000000.0+"ms");
         time[i]=(nanoTime1-nanoTime);
         System.out.println("*****************************************************************");
        
        }
        System.out.println("Arthematic Mean of InEfficient Merge Sort: "+Sorting.arithmeticMean(time)/1000000.0+"ms");
      
        // Radix Sort
        for (int i=0;i<run;i++){
        System.out.println("\n************************Radix Sorting **************************");
        Methods.shuffleArray(arr, (int) (arr.length*0.25));
        System.out.println("\nBefore Radix sort\n"+printArray(arr));
        long nanoTime = System.nanoTime();
        RadixSort.MSFRadixSort(arr);
        long nanoTime1 = System.nanoTime();
        System.out.println("\nAfter Radix sort\n"+printArray(arr));
        System.out.println("Sorted: "+Methods.isSorted(arr));
         System.out.println("Total Time Taken: "+(nanoTime1-nanoTime)/1000000.0+"ms");
         time[i]=(nanoTime1-nanoTime);
         System.out.println("*****************************************************************");
        
        }
        System.out.println("Arthematic Mean of Radix Sort: "+Sorting.arithmeticMean(time)/1000000.0+"ms");
    }
    public static String printArray(int[] arr){
         String str = "Array : {";
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) == arr.length) {
                str = str + arr[i];
                break;
            }
            str = str + arr[i] + ",";

        }
        return str + "}";
    }
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=s.nextInt();
        testingMethod(size,1);
        
        
 
    }
    /*********************************************************
     * Report
     * 
     * 1. Table
     *  --------------------------------------------------
     *  Name                  | Array Size    | time (ms).
     *  --------------------------------------------------
     * Quick Sort             | 5000          | 2.6768
     * Merge Sort(efficient)  | 5000          | 2.9033
     * Merge Sort(Inefficient)| 5000          | 3.278
     * Quick Sort             | 10000         | 0.9148
     * Merge Sort(efficient)  | 10000         | 1.7207
     * Merge Sort(Inefficient)| 10000         | 2.4402
     * Quick Sort             | 15000         | 1.1939
     * Merge Sort(efficient)  | 15000         | 1.4856
     * Merge Sort(Inefficient)| 15000         | 3.7972
     * Quick Sort             | 20000         | 1.8916
     * Merge Sort(efficient)  | 20000         | 1.854
     * Merge Sort(Inefficient)| 20000         | 4.4516
     * Quick Sort             | 25000         | 1.9002
     * Merge Sort(efficient)  | 25000         | 2.578
     * Merge Sort(Inefficient)| 25000         | 6.7498
     * Quick Sort             | 30000         | 2.8813
     * Merge Sort(efficient)  | 30000         | 2.8754
     * Merge Sort(Inefficient)| 30000         | 5.2885
     * Quick Sort             | 35000         | 2.4985
     * Merge Sort(efficient)  | 35000         | 4.964
     * Merge Sort(Inefficient)| 35000         | 6.8266
     * Quick Sort             | 40000         | 4.3674
     * Merge Sort(efficient)  | 40000         | 3.9251
     * Merge Sort(Inefficient)| 40000         | 6.9311
     * Quick Sort             | 45000         | 3.4241
     * Merge Sort(efficient)  | 45000         | 4.0466
     * Merge Sort(Inefficient)| 45000         | 7.629
     * Quick Sort             | 50000         | 3.8257
     * Merge Sort(efficient)  | 50000         | 5.0481
     * Merge Sort(Inefficient)| 50000         | 8.7418
     * Quick Sort             | 55000         | 4.3084
     * Merge Sort(efficient)  | 55000         | 4.9577
     * Merge Sort(Inefficient)| 55000         | 9.0331
     * Quick Sort             | 60000         | 5.8914
     * Merge Sort(efficient)  | 60000         | 5.9042
     * Merge Sort(Inefficient)| 60000         | 7.9295
     * Radix Sort             | 5000          | 26.6596
     * Radix Sort             | 10000         | 13.006
     * Radix Sort             | 15000         | 19.8242
     * Radix Sort             | 20000         | 14.0395
     * Radix Sort             | 25000         | 9.8222
     * Radix Sort             | 30000         | 9.5334
     * Radix Sort             | 35000         | 6.9925
     * Radix Sort             | 40000         | 2.4675
     * Radix Sort             | 45000         | 2.4237
     * Radix Sort             | 50000         | 3.4452
     * Radix Sort             | 55000         | 3.7157
     * Radix Sort             | 60000         | 2.4562
     
     * ----------------------------------------------------
     * 
     * 2.  Merge sort is more efficient and works faster than quick sort in case of larger
     * array size or datasets for dataset of size 10000 with 2500  swaps the time taken by
     * quick sort is more than the time taken by merge sort
     * 
     * 3. Efficient merge sort cost less than the inefficient merge sort as the time taken for sorting 
     * array  of size 10000 with with 2500  swaps through efficient merge sort is less than time taken 
     * for sorting same array with inefficient merge sort 
     * 
     * 4. Merge sort is more efficient than the Radix sort as the time taken for sorting 
     * array  of size 10000 with with 2500  swaps through efficient merge sort is less than time taken 
     * for sorting same array with Radix sort 
     * 
     * 5. When increasing the size of array, the comparing operation for every digit of element slows 
     * the radix sort
     * 
     * 
     *********************************************************/


}

