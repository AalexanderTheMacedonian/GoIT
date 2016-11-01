package Module2.Homework; /**
 * Created by alexandrsemenov on 30.10.16.
 */
public class Bank {
    public static void main(String[] args) {

        public static double with(double b, double t) {
            double com = t * 0.05;
            double tot = t + com;
            if (tot > b) {
                System.err.println("NO");
            } else {
                b = b - tot;
                System.out.println("OK " + com + " " + b);
            }
            return b;

        }
    }
}

