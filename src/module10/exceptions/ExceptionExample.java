package module10.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            dangerous();
            dangerous1();
        } catch (IOException e) {
            System.out.println("file not found");
        } finally {
            System.out.println("finally");
        }

        complexMethod();
    }

    static void complexMethod() {
        try {
            dangerous();
        } catch (IOException e) {
            //send email to admin
        }
    }

    static void dangerous() throws IOException {
        Scanner scanner = new Scanner(new File("/path"));
        System.out.println("File changed and saved");
    }

    static void dangerous1() throws IOException {
        Scanner scanner = new Scanner(new File("/path"));
        System.out.println("File changed and saved");
    }
}
