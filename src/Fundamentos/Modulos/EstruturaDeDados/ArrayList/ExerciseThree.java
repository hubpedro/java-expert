package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciseThree {
    /* Crie uma ArrayList com 10 números inteiros (1-10).
     *  Peça ao usuário para digitar um número.
     *  Verifique se esse número existe na lista usando contains().
     *
     */
    void main() {
        ArrayList<Integer> data = IntStream.generate(() -> new Random().nextInt(0, 99)).limit(100).boxed().collect(Collectors.toCollection(ArrayList::new));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 100: ");
        int userNumber = Integer.parseInt(sc.nextLine());

        BiPredicate<ArrayList<Integer>, Integer> checkIfNumberExists = ArrayList::contains;

        boolean result = checkIfNumberExists.test(data, userNumber);

        System.out.printf("Does %d inside the ArrayList: %s%n", userNumber, result);

        System.out.print(data);
    }

}
