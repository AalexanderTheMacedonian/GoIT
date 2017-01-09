package module9.homework;

import module4.homework.Currency;
import module7.homework.Order;
import module7.homework.User;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by alexandrsemenov on 09.01.17.
 */
public class MainSet {
    public static void main(String[] args) {

        User user1 = new User(1, "Alex", "Black", "NewYork", 5000);
        User user2 = new User(2, "Bob", "Marley", "Buffalo", 10000);
        User user3 = new User(3, "Tom", "Green", "LosAngeles", 3000);
        User user4 = new User(4, "Jack", "Brown", "LasVegas", 0);
        User user5 = new User(5, "Bill", "White", "Paris", 500);
        User user6 = new User(6, "Vasya", "Pypkin", "Kiev", 9400);
        User user7 = new User(7, "Petya", "Petrov", "Kharkov", 2222);
        User user8 = new User(8, "Andrey", "Sidorov", "Lviv", 23000);
        User user9 = new User(9, "Alexandr", "Great", "Amsterdam", 100000);

        Set<Order> set = new TreeSet<>();

        set.add(new Order(1, 200, Currency.USD, "Item1", "Indificator1", user1));
        set.add(new Order(2, 1000, Currency.USD, "Item2", "Indificator2", user2));
        set.add(new Order(3, 2000, Currency.USD, "Item3", "Indificator3", user3));
        set.add(new Order(4, 20, Currency.USD, "Item4", "Indificator4", user4));
        set.add(new Order(5, 200, Currency.EUR, "Item5", "Indificator5", user5));
        set.add(new Order(6, 50, Currency.UAH, "Item6", "Indificator6", user6));
        set.add(new Order(7, 900, Currency.UAH, "Item7", "Indificator7", user7));
        set.add(new Order(8, 8000, Currency.UAH, "Item8", "Indificator8", user8));
        set.add(new Order(9, 9000, Currency.UAH, "Item9", "Indificator9", user9));

        findPetrov(set);
        delUSD(set);
    }

    private static void delUSD(Set<Order> set) {
        set.stream()
                .filter(order -> order.getCurrency()!= Currency.USD)
                .collect(Collectors.toSet());
    }

    private static void findPetrov(Set<Order> set) {
        List<Order> res = set.stream()
                .filter(order -> order.getUser().getLastName().equals("Petrov"))
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
