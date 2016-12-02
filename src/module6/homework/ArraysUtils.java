package module6.homework;

/**
 * Created by alexandrsemenov on 02.12.16.
 */
public final class ArraysUtils {

    public static int secondLargest(int[] array) {
        for(int j = 2; j>0; j--) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    int l = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = l;
                }
            }
        }
        return array[array.length - 2];
    }

    public static int modulus(int[] array){
        int q = 0;
        if(array[array.length-1] != 0) {
            q = array[0] % array[array.length-1];
        }
        return q;
    }

    public static int max(int[] array) {
        int ma = array[0];
        for (int arr : array) {
            if (arr > ma){
                ma = arr;
            }
        }
        return ma;
    }

    public static int min(int[] array) {
        int mi = array[0];
        for (int arr : array) {
            if(arr < mi){
                mi = arr;
            }
        }
        return mi;
    }

    public static int sum(int[] array) {
        int s = 0;
        for (int arr : array) {
            s += arr;
        }
        return s;
    }

    public static int multiplication(int[] array) {
        int p = 1;
        for(int arr : array) {
            if (arr != 0) {
                p *= arr;
            }
        }
        return p;
    }

    public static int maxPositive(int[] array) {
        int m = 0;
        for (int arr : array) {
            if(arr > m && arr > 0){
                m = arr;
            }
        }
        return m;
    }

    public static int[] reverse(int[] array){
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array){
        int count = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int index = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                evens[index] = elem;
                index++;
            }
        }
        return evens;
    }

}
