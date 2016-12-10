package module7.homework;

import module4.homework.Currency;

import java.util.*;

/**
 * Created by alexandrsemenov on 10.12.16.
 */
public class MainTree {
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

        Set<Order> list = new TreeSet<>();

        list.add(new Order(1, 200, Currency.USD, "Item1", "Indificator1", user1));
        list.add(new Order(2, 1000, Currency.USD, "Item2", "Indificator2", user2));
        list.add(new Order(3, 2000, Currency.USD, "Item3", "Indificator3", user3));
        list.add(new Order(4, 20, Currency.USD, "Item4", "Indificator4", user4));
        list.add(new Order(5, 200, Currency.EUR, "Item5", "Indificator5", user5));
        list.add(new Order(6, 50, Currency.UAH, "Item6", "Indificator6", user6));
        list.add(new Order(7, 900, Currency.UAH, "Item7", "Indificator7", user7));
        list.add(new Order(8, 8000, Currency.UAH, "Item8", "Indificator8", user8));
        list.add(new Order(9, 9000, Currency.UAH, "Item9", "Indificator9", user9));
        list.add(new Order(9, 9000, Currency.UAH, "Item9", "Indificator9", user9));

        checkForPetrov(list);

        Iterator<Order> iterator = list.iterator();
        System.out.println(iterator.next());

        delUsd(list);
    }

    private static void delUsd(Set<Order> list) {
        Iterator<Order> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.USD)){
                iterator.remove();
            }
        }
    }

    private static void checkForPetrov(Set<Order> list) {
        for (Order order : list) {
            if (order.getUser().getLastName().equals("Petrov")){
                System.out.println("Petrov was found.");
            }
        }
    }
}
