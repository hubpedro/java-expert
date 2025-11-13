package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFour {
    /*
    * Crie uma ArrayList com os números: 5, 10, 15, 20, 25.
    * Imprima o tamanho dela usando size().
    * O que você está praticando: size()
    * Questão: Como isso é diferente de um array tradicional?
    */
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(5, 10, 15, 20, 25));
        int[] arr = new int [4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
//      arr[4] = 5;  ArrayIndexOutOfBoundsException

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Normal array has fixed  size and cannot be resized but memory overhead is lower:".concat(String.valueOf(numbers.size())));

        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println("ArrayList can be resized but memory overhead is higher: ".concat(String.valueOf(numbers.size())));
    }

}
