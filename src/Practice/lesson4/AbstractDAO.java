package Practice.lesson4;

import java.util.Arrays;

/**
 * Created by alexandrsemenov on 21.11.16.
 */
public abstract class AbstractDAO implements DAO{
    abstract String[] getArray();
    abstract String[] setArray(String[] array);


    @Override
    public boolean addNewWord(String word) {
        setArray(Arrays.copyOf(getArray(), getArray().length + 1));
        getArray()[getArray().length - 1] = word;
        return true;
    }

    @Override
    public boolean updateWord(String oldWord, String newWord) {
        boolean isUpdated = false;
        int index = 0;
        for (String var : getArray()) {
            index++;
            if (var.equals(oldWord)){
                getList()[index] = newWord;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public boolean delete(String word) {
        boolean isUpdated = false;
        int index = 0;
        for (String var : getArray()) {
            index++;
            if (var.equals(word)){
                getArray()[index] = "";
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public String[] getList() {
        return getArray();
    }
}