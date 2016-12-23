package practice.lesson3.task1;

/**
 * Created by alexandrsemenov on 14.11.16.
 */
public class Converter {

    double course;

    public Converter(double course) {
        this.course = course;
    }

    public double convert(double uah) {
        return uah * course;
    }
}
