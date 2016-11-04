package Module2.Homework; /**
 * Created by alexandrsemenov on 30.10.16.
 */
public class Bank {
    public static void main(String[] args) {

    }

    public static double withdraw(double balance, double transaction) {
            double com = transaction * 0.05;
            double total = transaction + com;
            if (total >  balance)
                System.err.println("NO");
            else {
                 balance =  balance - total;
                System.out.println("OK " + com + " " +  balance);
            }
            return  balance;
        }
    }



