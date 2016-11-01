package Module2.Homework; /**
 * Created by alexandrsemenov on 30.10.16.
 */
public class Bank {
    public static void main(String[] args) {
        double balance;
        double transact;
        double com = transact*0.05;
        double tot = transact + com;
        if (tot > balance){
            System.err.println("NO");
        }
        else{
            balance = balance - tot;
            System.out.println("OK " + com + " " + balance);
        }



    }
}

