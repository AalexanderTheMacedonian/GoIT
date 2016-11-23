package module5.webinar;

/**
 * Created by alexandrsemenov on 22.11.16.
 */
public class ObjectExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();

        employee.setId(99);
        employee.setFirstName("Test");
        employee1.setFirstName("Test");


        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee.equals(employee1));

        Employee employee2 = employee;

        System.out.println(employee2.equals(employee));
    }
}
