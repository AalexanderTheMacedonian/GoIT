package module2.homework;

import module6.homework.ArraysUtils;

/**
 * Created by alexandrsemenov on 30.10.16.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[4] = -2;

        System.out.println(ArraysUtils.sum(array));
        System.out.println(ArraysUtils.min(array));
        System.out.println(ArraysUtils.max(array));
        System.out.println(ArraysUtils.maxPositive(array));
        System.out.println(ArraysUtils.multiplication(array));
        System.out.println(ArraysUtils.modulus(array));
        System.out.println(ArraysUtils.secondLargest(array));
        System.out.println(ArraysUtils.findEvenElements(array));
        System.out.println(ArraysUtils.reverse(array));
    }



}
