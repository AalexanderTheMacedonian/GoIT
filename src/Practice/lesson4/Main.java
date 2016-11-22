package Practice.lesson4;

/**
 * Created by alexandrsemenov on 21.11.16.
 */
public class Main {
    public static void main(String[] args) {
        DAO dao;
        String user = "eng";
        String monthToAdd = null;
        String monthUpdateSrc = null;
        String monthUpdateDest = null;

        switch (user) {
            case "eng":
                dao = new DAOeng();
                monthToAdd = "October";
                monthUpdateDest = "December";
                break;
            case "rus":
                dao = new DAOrus();
                monthToAdd = "Октябрь";
                monthUpdateDest = "Декабрь";
                break;
            default:
                dao = new DAOrus();
                monthToAdd = "Октябрь";
                monthUpdateDest = "Декабрь";
                break;
        }

        String[] array = dao.getList();

        dao.addNewWord("www");

        dao.getList();
    }
}
