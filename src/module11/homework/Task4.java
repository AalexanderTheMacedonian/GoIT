package module11.homework;

import java.util.StringTokenizer;

import static module11.homework.Task1.readFile;

/**
 * Created by alexandrsemenov on 17.01.17.
 */
public class Task4 {
    public static void main(String[] args) {
        String fileName = "/Users/alexandrsemenov/Desktop/test.rtf";
        String word = "test";
        System.out.println(check(word, readFile(fileName)));
    }

    private static int check(String word, String filename) {
        String line = readFile(filename);
        assert line != null;
        StringTokenizer st = new StringTokenizer(line);
        int i = 0;
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(word))
                i++;
        }
        return i;
    }
}
