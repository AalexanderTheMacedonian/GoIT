package practice.lesson3.task2;

/**
 * Created by alexandrsemenov on 14.11.16.
 */
public class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    double line1;
    double line2;
    double line3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.err.println("ALL THE POINT IN A 1 LINE");
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }


    private double square() {
        line1 = calculateLine(x1, y1, x2, y2);
        line2 = calculateLine(x2, y2, x3, y3);
        line3 = calculateLine(x3, y3, x1, y1);

        double perimeter = calculatePerimeter(line1, line2, line3);
        double halfOfPeremetr = perimeter / 2;
        return Math.sqrt(halfOfPeremetr * (halfOfPeremetr - line1) * (halfOfPeremetr - line2) * (halfOfPeremetr - line3));
    }


    private double calculateLine(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    private double calculatePerimeter(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    public double getSquare() {

        return square();
    }

    public double getPerimeter() {
        return calculatePerimeter(line1, line2, line3);
    }

}

