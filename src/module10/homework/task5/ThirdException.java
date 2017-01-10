package module10.homework.task5;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class ThirdException extends Exception {
    private String e;

    public ThirdException(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "ThirdException{" +
                "e='" + e + '\'' +
                '}';
    }
}
