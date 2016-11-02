package Module2.Homework;

/**
 * Created by alexandrsemenov on 30.10.16.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[4] = -2;

        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(maxPositive(array));
        System.out.println(multiplication(array));
        System.out.println(modulus(array));
        System.out.println(secondLargest(array));


    }

    private static int secondLargest(int[] array) {

        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(array[j] > array[j+1]){
                int l = array[j];
                array[j] = array[j+1];
                array[j+1] = l;
                }
            }
        }
        return array[array.length - 2];
    }

    private static int modulus(int[] array){
        int q = 0;
        if(array[array.length] != 0) {
            q = array[0] % array[array.length];
        }
        return q;
    }

    private static int max(int[] array) {
        int ma = array[0];
        for (int arr : array) {
            if (arr > ma){
                ma = arr;
            }
        }
        return ma;
    }

    private static int min(int[] array) {
        int mi = array[0];
        for (int arr : array) {
            if(arr < mi){
                mi = arr;
            }
        }
        return mi;
    }

    private static int sum(int[] array) {
        int s = 0;
        for (int arr : array) {
            s += arr;
        }
        return s;
    }

    private static int multiplication(int[] array) {
        int p = 1;
        for(int arr : array) {
            if (arr != 0) {
                p *= arr;
            }
        }
        return p;
    }

    private static int maxPositive(int[] array) {
        int m = 0;
        for (int arr : array) {
            if(arr > m && arr > 0){
                m = arr;
            }
        }
        return m;
    }

}
