package Fundamentals;

import java.util.ArrayList;

public class ExerciseSeven {
    /* Exercise 7: Clear Everything
     * Create an ArrayList, add 3 numbers, print the size, then clear everything with clear() and print again.
     * What you are practicing: clear(), size()
     * Think: What is the size after clear()?
     */

    void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        System.out.println("Size: " + numbers.size());
        numbers.clear();
        System.out.println("Size: " + numbers.size());
    }
}
