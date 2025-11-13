package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseNineteen {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(45, 12, 78, 3, 99, 22));

        System.out.println(numbers);

        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

        numbers.clear();
        System.out.println("ArrayList<Integer> numbers after clear() " + numbers);
        System.out.println("NoSuchElementException");
//        int max = Collections.max(numbers);
//        int min = Collections.min(numbers);

//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
    }
}
