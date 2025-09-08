package estruturadecontrole;

import java.util.Scanner;

public class Exercicio01 {
    /* Escreva um código onde o usuário entra com um número e seja gerado a tabuada de 1 até 10 desse número;*/
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int numbe = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = numbe * i;
            System.out.printf("%d x %d = %d\n", numbe, i, result);
        }
    
}
}
