package module7.ListExample;

/**
 * Created by alexandrsemenov on 08.12.16.
 */
public class User implements Comparable<User>{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;

    }

    @Override
    public int hashCode() {
        return 0;
    }


    @Override
    public int compareTo(User o) {
        return this.age - o.getAge();
    }

    public int getAge() {
        return age;
    }
}
