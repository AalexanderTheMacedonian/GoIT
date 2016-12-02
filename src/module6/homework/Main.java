package module6.homework;

/**
 * Created by alexandrsemenov on 02.12.16.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[4];
        users[0]= new User(1, "Alex", "Black", 3500, 9000);
        users[1]= new User(2, "Tomas", "White", 3000, 15000);
        users[2]= new User(3, "Bob", "Green", 3500, 7000);
        users[3]= new User(1, "Alex", "Black", 3500, 9000);

        UserUtils userUtils = new UserUtils();

        for (User user : userUtils.uniqueUsers(users)){
            System.out.println(user.getFirstName());
        }
        for (User user : userUtils.usersWithConditionalBalance(users, 7000)){
            System.out.println(user.getFirstName());
        }
    }
}
