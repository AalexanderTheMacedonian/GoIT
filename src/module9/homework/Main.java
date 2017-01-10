package module9.homework;

import module4.homework.Currency;
import module7.homework.Order;
import module7.homework.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by alexandrsemenov on 09.01.17.
 */
public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Alex", "Black", "LasVegas", 5000);
        User user2 = new User(2, "Bob", "Marley", "Buffalo", 10000);
        User user3 = new User(3, "Tom", "Green", "LosAngeles", 3000);
        User user4 = new User(4, "Jack", "Brown", "LasVegas", 0);
        User user5 = new User(5, "Bill", "White", "Paris", 500);
        User user6 = new User(6, "Vasya", "Pypkin", "Kiev", 9400);
        User user7 = new User(7, "Petya", "Petrov", "Kharkov", 2222);
        User user8 = new User(8, "Andrey", "Sidorov", "Lviv", 23000);
        User user9 = new User(9, "Alexandr", "Great", "Amsterdam", 100000);
        User user10 = new User(10, "Ygin", "Stick", "NewYork", 50000);


        List<Order> list = new ArrayList<>();

        list.add(new Order(1, 200, Currency.USD, "Item1", "Indificator1", user1));
        list.add(new Order(2, 1000, Currency.USD, "Item2", "Indificator2", user2));
        list.add(new Order(3, 2000, Currency.USD, "Item3", "Indificator3", user3));
        list.add(new Order(4, 20, Currency.USD, "Item4", "Indificator4", user4));
        list.add(new Order(5, 200, Currency.EUR, "Item5", "Indificator5", user5));
        list.add(new Order(6, 50, Currency.UAH, "Item6", "Indificator6", user6));
        list.add(new Order(7, 900, Currency.UAH, "Item7", "Indificator7", user7));
        list.add(new Order(8, 8000, Currency.UAH, "Item8", "Indificator8", user8));
        list.add(new Order(9, 9000, Currency.UAH, "Item9", "Indificator9", user9));
        list.add(new Order(10, 150, Currency.EUR, "Item", "Indificator10", user10));

        //     sort by price
        list.sort((o1, o2) -> o1.getPrice() - o2.getPrice());


        //     sort by price and city
        list.sort((o1, o2) -> {
            if(o1.getPrice() == o2.getPrice()){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getPrice() - o2.getPrice();
        });


        //     sort by price, city and item indificator
        list.sort((o1, o2) -> {
            int r1 = o1.getItemName().compareTo(o2.getItemName());
            int r2 = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int r3 = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            if (r1 == 0 && r2 == 0)
                return r3;
            if (r1 == 0) {
                return r2;
            } else return r1;
        });



        delDuplicates(list);
        delLessPrice(list);
        splitForTwoLists(list);
        splitForCities(list);
    }

    private static Map<String, List<Order>> splitForCities(List<Order> list) {
        return list.stream()
                .collect(Collectors.groupingBy(order -> order.getUser().getCity()));
    }


    private static Map<Currency, List<Order>> splitForTwoLists(List<Order> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Order::getCurrency));
    }

    private static void delLessPrice(List<Order> list) {
        list.stream()
                .filter(order -> order.getPrice() > 1500)
                .collect(Collectors.toList());
    }

    private static void delDuplicates(List<Order> list) {
        list.stream().distinct().collect(Collectors.toList());
    }

}
