package module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexandrsemenov on 12.12.16.
 */
public class Timer {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();

        long startTime;
        long finishTime;

        //           A D D
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.add(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList added 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.add(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList added 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.add("String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList added 1000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.add("String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList added 1000 string elements for " + (finishTime - startTime) + " milliseconds.");

        integerArrayList.clear();
        integerLinkedList.clear();
        stringArrayList.clear();
        stringLinkedList.clear();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.add(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList added 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.add(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList added 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.add("String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList added 10000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.add("String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList added 10000 string elements for " + (finishTime - startTime) + " milliseconds.");


        //           S E T
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.set(i, i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList set 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.set(i, i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList set 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.set(i, "String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList set 1000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.set(i, "String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList set 1000 string elements for " + (finishTime - startTime) + " milliseconds.");

        //           1 0 0 0 0
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.set(i, i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList set 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.set(i, i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList set 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.set(i, "String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList set 10000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.set(i, "String");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList set 10000 string elements for " + (finishTime - startTime) + " milliseconds.");


        //           G E T
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList get 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList get 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList get 1000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList get 1000 string elements for " + (finishTime - startTime) + " milliseconds.");


        //           1 0 0 0 0
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList get 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList get 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList get 10000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList get 10000 string elements for " + (finishTime - startTime) + " milliseconds.");


        //           R E M O V E
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList removed 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList removed 1000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList removed 1000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList removed 1000 string elements for " + (finishTime - startTime) + " milliseconds.");

        //        A D D  E L E M E N T S
        for (int i = 0; i < 20000; i++) {
            integerArrayList.add(i);
            integerLinkedList.add(i);
            stringArrayList.add("String");
            stringLinkedList.add("String");
        }

        //           1 0 0 0 0
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList removed 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList removed 10000 integer elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList removed 10000 string elements for " + (finishTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList removed 10000 string elements for " + (finishTime - startTime) + " milliseconds.");

    }
}
