package module6.staticExample;

/**
 * Created by alexandrsemenov on 30.11.16.
 */
public class User {
    private String firstName;
    private static String companyName;
    private int age;



    static {

    }





    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

}
