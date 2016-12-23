package practice.lesson4;

/**
 * Created by alexandrsemenov on 21.11.16.
 */
public class DAOeng extends AbstractDAO {
    String[] arrayEng = {"June", "July"};

    @Override
    String[] getArray() {
        return arrayEng;
    }

    @Override
    String[] setArray(String[] array) {
        return arrayEng = array;
    }
}
