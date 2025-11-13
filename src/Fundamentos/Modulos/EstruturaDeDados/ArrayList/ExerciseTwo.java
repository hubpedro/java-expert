package Fundamentos.Modulos.EstruturaDeDados.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseTwo{
    /*
     * Exercício 2: Adicionar Dinamicamente
        Crie um ArrayList vazia.
        * Peça ao usuário para digitar 5 nomes de cidades.
        * Adicione cada uma à lista.
        * Por fim, imprima todas as cidades adicionadas.
        * O que você está praticando: Entrada do usuário, add()
        * Desafio: Use um loop para ler 5 vezes em vez de escrever 5 vezes
     */
    void main() {
        ArrayList<String> cities = new ArrayList<String>(5);
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Enter City Name: ");
            cities.add(scanner.nextLine());
        }
        cities.forEach(System.out::println);
    }
}