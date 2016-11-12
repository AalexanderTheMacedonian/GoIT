package Module3.homework.task2;

/**
 * Created by alexandrsemenov on 12.11.16.
 */
public class Arithmetic {
    public int add(int[] ints){
        int sum = 0;
        for (int var : ints) {
            sum += var;
        }
        return sum;
    }
}
