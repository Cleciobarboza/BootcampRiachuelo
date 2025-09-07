package fundamentojava;

import java.util.Scanner;

public class Exercicio04 {
    /* Escreva um código que receba o nome e a idade de 2 pessoas
       e imprima a diferença de idade entre elas */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Informe a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do Enter

        System.out.print("Informe o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Informe a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferencaIdade = Math.abs(idade1 - idade2);
        System.out.printf("A diferença de idade entre %s e %s é: %d anos\n", nome1, nome2, diferencaIdade);

        scanner.close();
    }
}
