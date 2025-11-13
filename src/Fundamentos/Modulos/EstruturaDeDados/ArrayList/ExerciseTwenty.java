package Fundamentos.Modulos.EstruturaDeDados.ArrayList;

import java.util.ArrayList;

public class ExerciseTwenty {
    void main() {
        int size = 5;
        ArrayList<Product> products = new ArrayList<Product>(size);
        for (int i = 0; i < size; i++) {
            products.add(new Product("Random product", 50.00));
        }

        System.out.println(calculatePrice(products));

    }

    double calculatePrice(ArrayList<Product> products) {
        return products.stream()
                .reduce(0.0,
                        (acc, p) -> acc + p.getPrice(),
                        Double::sum);
    }

    class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return this.price;
        }

        @Override
        public String toString() {
            return String.format("Person[Name: %s, Price: %s]", name, price);
        }
    }
}
