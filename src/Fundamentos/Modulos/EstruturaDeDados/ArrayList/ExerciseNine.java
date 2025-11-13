package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExerciseNine {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(10, 20, 30, 40));
        System.out.println("Before" + numbers);
        numbers.set(2, 35);
        System.out.println("After" + numbers);

    }
}
