import java.util.Scanner;

public class SomaDeConjunto {
    public SomaDeConjunto() {
    }

    public void somaConjunto() {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int i = 0;
        System.out.println("Quantos numeros serao somados?");

        int num;
        for(int n = input.nextInt(); i < n; soma += num) {
            ++i;
            System.out.println("Diga o " + i + " numero!");
            num = input.nextInt();
        }

        System.out.println("A soma e: " + soma);
    }
}
