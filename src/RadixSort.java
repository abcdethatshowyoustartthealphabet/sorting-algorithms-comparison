
package sorting;

import java.util.ArrayDeque;
import java.util.HashMap;


public class RadixSort {
    
    
    public static void MSFRadixSort(int[] arr) {
        int digits = getMax(arr);
        for (int i = (digits+"").length(); i >= 1; i--) {
            sortDigitByDigit(arr, i);
        }
    }

   
    public static int getMax(int[] arr) {
        int maximum = 0;
        for (int i =0;i< arr.length;i++) {
            String num = ""+i;
            if (num.length() > maximum) {
                maximum = num.length();
            }
        }
        return maximum;
    }

    private static void sortDigitByDigit(int[] arr, int n) {
        int digit = arr.length - n;
        
        HashMap<Integer, ArrayDeque<Integer>> bins =new HashMap<>();

        for (int i = 0; i <= 9; i++) {
            bins.put(i, new ArrayDeque<>());
        }

        for (int i : arr) {
            for (int k = 1; k < n; k++) {
                i /= 10;
            }
            int num = i % 10;
            bins.get(num).add(i);
        }
        int i = 0;

        for (int k = 0; k <= 9; k++) {
            ArrayDeque<Integer> bin = bins.get(k);
            while (!bin.isEmpty()) {
                arr[i] = bin.remove();
                i++;
            }
        }
    }
}
