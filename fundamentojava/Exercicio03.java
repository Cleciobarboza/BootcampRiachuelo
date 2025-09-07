package fundamentojava;

import java.util.Scanner;

public class Exercicio03 {
    /*Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
fórmula: área=base X altura */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("A área do retângulo é: %.2f\n", area);

        scanner.close();
    }
}
