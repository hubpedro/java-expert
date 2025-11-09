package Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ExerciseOne {
    /*
     * Crie uma ArrayList de Strings com 5 frutas (maçã, banana, laranja, uva, melancia).
     * Depois imprima cada uma em uma linha separada usando um for.
     * O que você está praticando: add(), get(), iteração Dica: Use .size() para saber quantos elementos tem
     */
    void main() {
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange", "Pear", "Strawberry"));
        fruits.forEach(System.out::println);
        System.out.printf("Size: %d\n", fruits.size());
    }
}
