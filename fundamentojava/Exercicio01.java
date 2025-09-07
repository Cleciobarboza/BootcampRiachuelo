package fundamentojava;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio01 {
    /* Escreva um código que receba o nome e o ano de nascimento de alguém
       e imprima na tela a seguinte mensagem:
       "Olá 'Fulano' você tem 'X' anos" */

    public static void main(String[] args) {
        int baseYear = OffsetDateTime.now().getYear(); // Ano atual
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String name = scanner.nextLine(); // agora é String

        System.out.print("Informe o seu ano de nascimento: ");
        int year = scanner.nextInt();

        int age = baseYear - year;

        System.out.printf("Olá %s, você tem %d anos\n", name, age);

        scanner.close();
    }
}
