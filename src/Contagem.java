import java.util.Scanner;

public class Contagem {
    public Contagem() {
    }

    public void contagem() {
        Scanner input = new Scanner(System.in);
        int contInt = 0;
        int contFloat = 0;
        int i = 0;
        System.out.println("Quantos elementos?");

        for (int numero = input.nextInt(); i < numero; ++i) {
            float valor = input.nextFloat();
            int aux = (int) valor;
            if ((float) aux == valor) {
                ++contInt;
            } else {
                ++contFloat;
            }
        }

        System.out.println("numeros que sao inteiros: " + contInt);
        System.out.println("numeros que nao sao inteiros: " + contFloat);
    }
}