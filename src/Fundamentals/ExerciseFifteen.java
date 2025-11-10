package Fundamentals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExerciseFifteen {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(15, 3, 42, 7, 1));
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
    }
}
