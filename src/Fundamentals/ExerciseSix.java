package Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSix {
    void main() {
        ArrayList<String> colors = new ArrayList<>(List.of("red", "green", "blue", "yellow"));
        boolean blue = colors.remove("blue");
        System.out.println("Blue was removed: " + blue);
    }
}
