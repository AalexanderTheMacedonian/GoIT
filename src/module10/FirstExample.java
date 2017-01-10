package module10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class FirstExample {
    public static void main(String[] args) throws Exception{

        Integer a = null;

        try {
            a.toString();

            try {
                List<String> list = new ArrayList<>();
                list.get(0);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("qwe");
            }

        }
        catch (NullPointerException e) {
            System.out.println("null pointer has happend");
            System.out.println(a);


            Exception exception = new Exception("Some exception", e);
            //throw exception;

        }






    }
}
