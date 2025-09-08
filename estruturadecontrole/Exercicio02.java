package estruturadecontrole;

import java.util.Scanner;

public class Exercicio02 {
    /* Escreva um código onde o usuário entra com sua altura e peso,
       seja feito o cálculo do seu IMC (IMC = peso/(altura * altura)) e seja exibida
       a mensagem de acordo com o resultado. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua altura (em metros, ex: 1,75): ");
        float altura = scanner.nextFloat();

        System.out.print("Informe seu peso (em kg): ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
    }
}
