package Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTwelve {
    void main() {
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange", "Watermelon"));
        System.out.println("Before " + fruits);

        boolean someFruitHasBeenRemoved = fruits.removeIf(fruit -> fruit.toLowerCase().startsWith("b"));

        System.out.println("One fruit was removed: " + someFruitHasBeenRemoved);

        System.out.println("After " + fruits);
    }
}
