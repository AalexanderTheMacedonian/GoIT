package practice.lesson3.task3;

/**
 * Created by alexandrsemenov on 17.11.16.
 */
public class Main {
    public static void main(String[] args) {

        Worker[] workers = new Worker[10];
        workers[0] = new Worker("AA", 100);
        workers[1] = new Worker("AA", 200);
        workers[2] = new Worker("AA", 0);
        workers[3] = new Worker("AA", 100);
        workers[4] = new Worker("AA", 100);
        workers[5] = new Worker("AA", 100);
        workers[6] = new Worker("AA", 0);
        workers[7] = new Worker("AA", 100);
        workers[8] = new Worker("AA", 0);
        workers[9] = new Worker("AA", 100);

        System.out.println(sumOfSalarys(workers));

    }

    private static long sumOfSalarys(Worker[] workers) {
        long sum=0;
        for (Worker worker : workers) sum += worker.getSalary();
        return sum;
    }
}
