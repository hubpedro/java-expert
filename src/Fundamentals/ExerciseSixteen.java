package Fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExerciseSixteen {
    void main() {
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "banana", "orange", "banana"));
        System.out.println("Fruits: " + fruits);
        HashSet<String> fruitSet = new HashSet<>(fruits);
        System.out.println("FruisHashtSet: " + fruitSet);
        ArrayList<String> unique = new ArrayList<>(fruitSet);
        System.out.println("unique: " + unique);
    }
}
