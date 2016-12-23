package module7.homework;

import com.sun.org.apache.xpath.internal.operations.Or;
import module4.homework.Currency;

import java.util.*;

/**
 * Created by alexandrsemenov on 09.12.16.
 */
public class Main {
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

        //Collections.sort(list, new PriceComporator());

        list.sort(new PriceComporator());
        list.sort(new PriceAndCity());
        list.sort(new ItemIndificatorCity());

        delDuplicates(list);
        delLessPrices(list);
        splitByCurrency(list);
        splitByCity(list);
    }

    private static List<List<Order>> splitByCity(List<Order> list) {
        List<List<Order>> uniqueCityList = new ArrayList<>();
        Set<String> uniqueCities = new HashSet<>();
        for (Order order : list) {
            String city = order.getUser().getCity();
            if (uniqueCities.add(city)){
                List<Order> currentList = new ArrayList<>();
                currentList.add(order);
                uniqueCityList.add(currentList);
            }
            else {
                int index = 0;
                for (List<Order> orders : uniqueCityList) {
                    if (orders.get(index).getUser().getCity().equals(city)){
                        uniqueCityList.get(index).add(order);
                    }
                    else index++;
                }
            }
        }
        return uniqueCityList;
    }

    private static void splitByCurrency(List<Order> list) {
        List<Order> usdList = new ArrayList<>();
        List<Order> uahList = new ArrayList<>();
        for (Order order : list) {
            if (order.getCurrency() == Currency.USD) usdList.add(order);
            if (order.getCurrency() == Currency.UAH) uahList.add(order);
        }
    }

    private static void delLessPrices(List<Order> list) {
        List<Order> lessPrices = new ArrayList<>();
        for (Order order : list) {
            if (order.getPrice() < 1500) lessPrices.add(order);
        }
        for (Order lessPrice : lessPrices) {
            list.remove(lessPrice);
        }
    }


    private static void delDuplicates(List<Order> list) {
        Set<Order> newList = new HashSet<>(list);
        list.clear();
        list.addAll(newList);
    }
}
