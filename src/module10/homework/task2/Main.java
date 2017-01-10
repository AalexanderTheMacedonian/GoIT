package module10.homework.task2;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            test(4);
        } catch (MyException e) {
            System.out.println(e);
        }
    }

    private static void test(int i) throws MyException {
        if (i < 5) throw new MyException("The digit is too small");
    }
}
