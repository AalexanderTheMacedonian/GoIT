package Module2;

/**
 * Created by alexandrsemenov on 01.11.16.
 */
public class MethodsExample {

    public static void main(String[] args) {

        test(500, (byte) 5);

    }

    static int test(int a, byte b) {
        int result;

        if(a<b)
            result = a;
        else
            result = b;

        return result;
    }

    static void test1(int a, byte b) {

    }
}
