package module10.homework.task5;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class FirstException extends Exception {
    private String e;

    public FirstException(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "FirstException{" +
                "e='" + e + '\'' +
                '}';
    }
}
