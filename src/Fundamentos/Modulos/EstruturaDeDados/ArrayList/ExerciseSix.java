package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSix {
    /* Exercise 6: Remove Element
     * Create an ArrayList with colors: ["red", "blue", "green", "yellow"].
     * Remove the color "blue" using remove().
     * What you are practicing: remove()
     * Question: Which is safer: remove by index or by value?
     */
    void main() {
        ArrayList<String> colors = new ArrayList<>(List.of("red", "green", "blue", "yellow"));
        boolean blue = colors.remove("blue");
        System.out.println("Blue was removed: " + blue);
    }
}
