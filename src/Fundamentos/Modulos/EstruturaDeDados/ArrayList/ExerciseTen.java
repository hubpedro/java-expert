package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTen {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> subNumbers = numbers.subList(2, 5);

        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Sub ArrayList: " + subNumbers);
        System.out.println("The end param toIndex is not included on subList: " + numbers.get(5));
    }
}
