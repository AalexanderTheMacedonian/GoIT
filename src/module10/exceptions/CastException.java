package module10.exceptions;

import module7.homework.User;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class CastException {
    public static void main(String[] args) {
        try {
            System.out.println((User) someMethod());
        } catch (ClassCastException e){
            //here can be anything u need
            //send email
            //or nothing
            System.out.println("someMethod returned not user type");
        }

    }

    static Object someMethod() {
        return new Integer(10);
    }
}
