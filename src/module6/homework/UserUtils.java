package module6.homework;

/**
 * Created by alexandrsemenov on 02.12.16.
 */
public class UserUtils {

    User[] uniqueUsers(User[] users){
        for (int i = 0; i < users.length-1; i++) {
            for (int j = 1; j < users.length; j++) {
                if (users[i].equals(users[j])) users[j] = null;
            }
        }
        return deleteEmptyUsers(users);
    }

    User[] usersWithConditionalBalance(User[] users, int balance){
        int count = 0;
        for (User us : users) {
            if (us.getBalance() == balance) count++;
        }
        User[] res = new User[count];
        int index = 0;
        for (User us : users){
            if (us.getBalance() == balance){
                res[index] = us;
                index++;
            }
        }
        return res;
    }

    final void paySalaryToUsers(User[] users){
        for (User us : users){
            us.setBalance(us.getBalance()+us.getSalary());
        }
    }

    final long[] getUsersId(User[] users){
        long[] res = new long[users.length];
        int index = 0;
        for (User user : users){
            res[index] = user.getId();
        }
        return res;
    }

    User[] deleteEmptyUsers(User[] users){
        int quantityOfEmptyUs = 0;
        for (User user : users){
            if (user == null) quantityOfEmptyUs++;
        }
        User[] res = new User[users.length-quantityOfEmptyUs];
        int index = 0;
        for (User user : users){
            if(user != null){
                res[index] = user;
                index++;
            }
        }
        return res;
    }

}
