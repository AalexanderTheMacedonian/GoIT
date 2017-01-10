package module10.exceptions;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class IllegalArgumentExceptionExmpl {
    public static void main(String[] args) {
        System.out.println("Long values is - " + convert("200"));

        System.out.println("Long values is - " + convert("200a"));

    }

    static Long convert(String input) {
        return Long.valueOf(input);
    }
}
