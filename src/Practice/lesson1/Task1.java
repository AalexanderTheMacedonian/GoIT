package Practice.lesson1;

import java.util.Arrays;

/**
 * Created by alexandrsemenov on 29.10.16.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] balances = {100, 5400, 4321, 900, -50, 0};
        String[] names = {"Test1", "Test2", "Test3", "Test4", "Test5", "Test6"};

        int count = 0;
        for(int bal : balances){
            if(bal > 1000) {
                count += 1;
            }

        }

        String[] owners = new String[count];

        int indexOwners = 0;
        int index = 0;

        for(int bal : balances){
            if(bal > 1000) {
                owners[indexOwners] = names[index];
                indexOwners++;
            }
            index++;

        }
        System.out.println(Arrays.toString(owners));
    }
}
