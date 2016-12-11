package module3.homework.task3;

import java.util.Date;

/**
 * Created by alexandrsemenov on 12.11.16.
 */
public class Solution {
    public static void main(String[] args) {

        Course c1 = new Course(4, "Teacher1");
        Course c2 = new Course(2, "Teacher2");
        Course c3 = new Course(7, "Teacher3");
        Course c4 = new Course(8, "Teacher4");

        Date date = new Date(9999999);
        Course c5 = new Course(date, "Name");

        Course[] courses1 = {c1,c2,c3};
        Course[] courses2 = {c3,c4,c5};

        Student st1 = new Student("FirstName", "LastName", 5);
        Student st2 = new Student("LastName", courses1);

        CollegeStudent st3 = new CollegeStudent("FirstName", "LastName", 9);
        CollegeStudent st4 = new CollegeStudent("LastName",courses2);
        CollegeStudent st5 = new CollegeStudent("FirstName", "LastName", 2, "CollegeName", 2, 27043);

        SpecialStudent st6 = new SpecialStudent("FirstName", "LastName", 4);
        SpecialStudent st7 = new SpecialStudent("LastName", courses1);
        SpecialStudent st8 = new SpecialStudent("FirstName", "LastName", 10, "CollegeName", 2, 55378, 1234567);

    }
}
