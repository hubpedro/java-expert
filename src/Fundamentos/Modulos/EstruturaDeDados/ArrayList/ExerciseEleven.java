package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;

public class ExerciseEleven {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>(0);
        System.out.println("Before " + numbers);
        IO.println("The ArrayList is empty: " + numbers.isEmpty());
        numbers.add(1);
        IO.println("The ArrayList is empty: " + numbers.isEmpty());
        System.out.println("After " + numbers);
    }
}
