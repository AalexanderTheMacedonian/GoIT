package module10.homework.task2;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class MyException extends Exception {
    String e;

    public MyException(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "e='" + e + '\'' +
                '}';
    }
}
