

import java.util.Random;

public class Methods {

    //A method that verifies that an array is in sorted order:
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //A method to fill an array with values to sort
    public static void fillArray(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = i;
            }
        }
    }
    //A method to randomize an array that is filled with numbers

    public static void shuffleArray(int[] ar, int n) {
        int index = 0, index1 = 0;
        Random rnd = new Random();
        for (int i = n; i > 0; i--) {
            do {
                index = rnd.nextInt(((ar.length - 1) - 0) + 1) + 0;
                index1 = rnd.nextInt(((ar.length - 1) - 0) + 1) + 0;
            } while (index == index1);
            
            int a = ar[index];
            ar[index] = ar[index1];
            ar[index1] = a;
        }
    }
}
