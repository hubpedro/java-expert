package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseFourteen {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(15, 3, 42, 7, 1));
        System.out.println("Before:" + numbers);
        Collections.sort(numbers);
        System.out.println("Calling Collections.sort");
        System.out.println("After:" + numbers);
    }
}
