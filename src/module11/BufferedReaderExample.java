package module11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexandrsemenov on 17.01.17.
 */
public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 3;
        while (count > 0){
            String input;
            try {
                input = br.readLine();
            } catch (IOException e) {
                System.err.println("sys err");
                throw e;
            }
            System.out.println("The string " + input + " is read");

            try {
                int a = Integer.valueOf(input);
                System.out.println(input + 10);
            } catch (NumberFormatException e) {
                System.out.println("not integer");
            }
            count --;
        }

        System.out.println("finished");

        try {
            //if (br != null)
                br.close();
        } catch (IOException e) {
            System.out.println("close is failed");
        }
    }
}
