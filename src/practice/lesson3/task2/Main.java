package practice.lesson3.task2;

/**
 * Created by alexandrsemenov on 14.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle(0, 0, 2, 2, 2, 0);
        System.out.println(tr.getSquare() + " " + tr.getPerimeter());
    }
}
