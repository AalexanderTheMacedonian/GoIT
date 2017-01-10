package module10.homework.task5;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class SecondException extends Exception {
    private String e;

    public SecondException(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "SecondException{" +
                "e='" + e + '\'' +
                '}';
    }
}
