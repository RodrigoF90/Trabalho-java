import java.util.Scanner;

public class Fibo {
    public Fibo() {
    }

    public void sequence() {
        int n = 0;
        int d = 1;
        int i = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos termos?");

        int numero;
        for(numero = input.nextInt(); i < numero; i += 2) {
            System.out.println("" + n + " , " + d + " , ");
            n += d;
            d += n;
        }

        if (i == numero) {
            System.out.println("" + n + " , " + d);
        } else {
            System.out.println(n);
        }

    }
}