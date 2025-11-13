package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ExerciseThirteen {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final Random random = new Random();

    void main() {
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            persons.add(new Person(generateRandomName(12), new Random().nextInt(18, 70)));
        }
        persons.forEach(System.out::println);
    }

    String generateRandomName(int nameLength) {
        StringBuilder name = new StringBuilder(nameLength);
        for (int i = 0; i < nameLength; i++) {
            char letter = ALPHABET.charAt(random.nextInt(ALPHABET.length()));
            name.append(letter);
        }
        return name.toString();
    }


    class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("Name: %s, Age: %d", name, age);
        }
    }
}
