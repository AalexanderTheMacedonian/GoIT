package Module2.Homework;

/**
 * Created by alexandrsemenov on 01.11.16.
 */
public class Bank3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String a = "Jack"
    }


    public static double with(String a, double withdrawal) {
        int b;
        for (String s : ownerNames) {
            if (s.contentEquals(a) == 1) {
                b = ownersNamew[index];
            }
            index++;
        }
        double com = withdrawal * 0.05;
        double tot = withdrawal + com;
        if (tot > b)
            System.err.println("NO");
        else {
            b = b - tot;
            System.out.println("OK " + com + " " + b);
        }
        return b;
    }
}


