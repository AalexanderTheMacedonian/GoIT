package practice.lesson1;

import java.util.Random;

/**
 * Created by alexandrsemenov on 29.10.16.
 */
public class VariablesExample {
    public static void main(String[] args) {
        int peopleCount = 10;
        long population = 7000000;
        byte variable = 100;


        boolean isActive = false;
        isActive = true;


        double index = 4.5;
        float index1 = 10.444f;


        Random random = new Random();
        random.nextDouble();


        char letter = 't';
        String test = "Alexandr";


        System.out.println(peopleCount * 5);

    }
}