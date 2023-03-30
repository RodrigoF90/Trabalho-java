import java.util.Scanner;

public class NumeroPrimo {
    public NumeroPrimo() {
    }

    static boolean verificarPrimo(int numero) {
        for(int i = 2; i < numero; ++i) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void numeroPrimo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero!");
        int numero = input.nextInt();
        if (verificarPrimo(numero)) {
            System.out.println("O numero e primo");
        } else {
            System.out.println("O numero nao e primo");
        }

    }
}