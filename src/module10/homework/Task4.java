package module10.homework;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            f();
        } catch (ClassCastException e) {
            throw new ArithmeticException();
        }
    }

    private static void f() {
        g();
    }

    private static void g() {
        throw new ClassCastException();
    }
}
