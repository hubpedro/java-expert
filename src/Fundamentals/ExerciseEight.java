package Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ExerciseEight {
    void main() {
        ArrayList<String> names = new ArrayList<>(List.of("Ana", "Bruno", "Carlos", "Diana"));
        int index = names.indexOf("Carlos");

        if (index != -1) {
            System.out.println("Carlos found at Index: " + index);
        } else {
            System.out.println("Carlos not found");
        }

    }
}
