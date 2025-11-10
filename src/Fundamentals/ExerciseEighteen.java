package Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ExerciseEighteen {
    void main() {
        ArrayList<String> letter = new ArrayList<>(List.of("A", "B", "D"));
        System.out.println(letter);
        letter.add(2, "C");
        System.out.println(letter);
        letter.remove(2);
        System.out.println(letter);
        letter.set(2, "C");
        System.out.println(letter);
    }

}
