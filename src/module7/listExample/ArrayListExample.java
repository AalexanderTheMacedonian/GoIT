package module7.listExample;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by alexandrsemenov on 08.12.16.
 */
public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("item");
        list.add("item1");
        list.add("item2");
        list.add("item3");

        List<String> list1 = new ArrayList<>();

        list1.addAll(list);


        UnaryOperator<String> operator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if(s.equals("item")){
                    return "haha";
                }
                return s;
            }
        };

        list.replaceAll(operator);

        list.retainAll(list1);


        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 22));
        users.add(new User("Test", 10));

        User userToDel = new User("Test", 5);
        users.remove(userToDel);
        //ничего не произойдет, тк в юзере задан иквалс по имени и возрасту/




        //     I T E R A T O R
        Iterator iter = list.iterator();

        while (iter.hasNext()){
            Object element = iter.next();
            iter.remove();
            System.out.println(element+" removed ");
        }



    }
}
