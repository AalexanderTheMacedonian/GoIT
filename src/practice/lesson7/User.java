package practice.lesson7;

/**
 * Created by alexandrsemenov on 12.12.16.
 */
public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}' + "\n";
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        return this.getAge() - o.getAge();
    }
}
