package Fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ExerciseSeventeen {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 1, 3, 1, 4));
        List<Integer> indexes = IntStream.range(0, numbers.size()).filter(i -> numbers.get(i) == 1).boxed().toList();
        System.out.println("numbers = " + numbers);
        System.out.println("indexes = " + indexes);
    }
}
