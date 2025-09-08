package estruturadecontrole;

import java.util.Scanner;

public class Exercicio03 {
    /* Escreva um código em que o usuário entre com um primeiro número,
       um segundo número maior que o primeiro e escolha entre a opção par e ímpar.
       O código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
       no intervalo de números informados, incluindo os números informados e em ordem decrescente. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int number1 = scanner.nextInt();

        int number2;
        while (true) {
            System.out.print("Informe o segundo número (maior que o primeiro): ");
            number2 = scanner.nextInt();
            if (number2 > number1) {
                break;
            }
            System.out.printf("O número deve ser maior que %d.\n", number1);
        }

        System.out.print("Você deseja ver números pares ou ímpares? (digite 'par' ou 'impar'): ");
        String escolha = scanner.next();

        System.out.printf("Números %s entre %d e %d em ordem decrescente:\n", escolha, number1, number2);

        for (int i = number2; i >= number1; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); 
        scanner.close();
    }
}
