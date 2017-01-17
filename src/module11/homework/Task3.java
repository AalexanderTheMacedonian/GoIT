package module11.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static module11.homework.Task1.readFile;
import static module11.homework.Task1.replacer;

/**
 * Created by alexandrsemenov on 17.01.17.
 */
public class Task3 {
    public static void main(String[] args) {
        String fileName = "/Users/alexandrsemenov/Desktop/test.rtf";
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("was", "will");
        File file;

        file = fileContentMerger(fileName, map);
        if (file != null) System.out.println("\nResult file after replacement:\n" + readFile(file.getPath()));
    }

    static File fileContentMerger(String fileName, Map<String, String> map) {
        File file = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        String replaced = replacer(fileName, map);

        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(System.lineSeparator());
            bufferedWriter.append(replaced);
            file = new File(fileName);
        } catch (IOException e) {
            System.err.format("IOException in fileContentMerger() method: %s%n", e);
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                System.err.format("IOException while closing resources: %s%n", e);
            }
        }
        return file;
    }
}
