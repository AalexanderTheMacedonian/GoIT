package module10.homework;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            throw new ClassCastException();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
