package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFive {
    /* Exercise Five
     * Create an ArrayList with ["JavaScript", "Python", "Java", "Go"].
     * Access and print the 1st, 2nd, 3rd and 4th element using get().
     * What you are practicing: get(), indices (start at 0)
     * Be careful: What is the index of the first element? 0 or 1?
     */
    void main() {
        ArrayList<String> langs = new ArrayList<>(List.of("JavaScript", "Python", "Java", "Go"));
        for (int i = 0; i < langs.size(); i++) {
            IO.println(String.format("index: %s arraylist value: %s", i, langs.get(i)));
        }

    }
}
