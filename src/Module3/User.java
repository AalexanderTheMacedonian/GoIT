package Module3;

/**
 * Created by alexandrsemenov on 09.11.16.
 */
public class User {

    private long id;
    private String name;
    private int age;
    private String company;



    public User(long id, String name, int age, String company) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.company = company;
    }



    void speak() {
        System.err.println("Im speaking");
    }

    void sendEmail() {
        //do smth
    }



    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
       // if(company != "Test" && company.length() > 5)
            return company;
       // else return "";
    }

    public void setCompany(String company) {
        this.company = company;
    }


}
