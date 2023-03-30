import java.util.Scanner;

public class Mdc {
    public Mdc() {
    }

    public void calcularMdc() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor!");
        int c = input.nextInt();
        System.out.println("Digite seu segundo valor!");

        int resto;
        for(int d = input.nextInt(); d != 0; d = resto) {
            resto = c % d;
            c = d;
        }

        System.out.println("O MDC e: " + c);
    }
}