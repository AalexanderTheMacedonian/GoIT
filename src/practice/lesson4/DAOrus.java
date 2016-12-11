package practice.lesson4;

/**
 * Created by alexandrsemenov on 21.11.16.
 */
public class DAOrus extends AbstractDAO {
    String[] arrayRus = {"Июнь","август"};

    @Override
    String[] getArray() {
        return arrayRus;
    }

    @Override
    String[] setArray(String[] array) {
        return arrayRus = array;
    }
}
