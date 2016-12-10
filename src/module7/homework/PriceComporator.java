package module7.homework;

import java.util.Comparator;

/**
 * Created by alexandrsemenov on 10.12.16.
 */
public class PriceComporator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
