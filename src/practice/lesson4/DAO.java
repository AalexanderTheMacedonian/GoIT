package practice.lesson4;

/**
 * Created by alexandrsemenov on 21.11.16.
 */
public interface DAO {
    boolean addNewWord(String word);

    boolean updateWord(String oldWord, String newWord);

    boolean delete(String word);

    String[] getList();
}
