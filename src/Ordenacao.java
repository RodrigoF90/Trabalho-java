import java.util.Scanner;

public class Ordenacao {
    Scanner input;

    public Ordenacao() {
        this.input = new Scanner(System.in);
    }

    int particao(int[] a, int baixo, int alto) {
        int pivo = a[alto];
        int i = baixo - 1;

        int j;
        for(j = baixo; j < alto; ++j) {
            if (a[j] < pivo) {
                ++i;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        j = a[i + 1];
        a[i + 1] = a[alto];
        a[alto] = j;
        return i + 1;
    }

    void quicksort(int[] a, int baixo, int alto) {
        if (baixo < alto) {
            int parte = this.particao(a, baixo, alto);
            this.quicksort(a, baixo, parte - 1);
            this.quicksort(a, parte + 1, alto);
        }

    }

    public void ordenacao() {
        System.out.println("Tamanho da lista:");
        int tamanho = this.input.nextInt();
        int[] a = new int[tamanho];
        System.out.println("Entrada dos elementos:");

        for(int i = 0; i < tamanho; ++i) {
            a[i] = this.input.nextInt();
        }

        Ordenacao variavel = new Ordenacao();
        variavel.quicksort(a, 0, tamanho - 1);
        System.out.println("A ordem dos elementos e: ");

        for(int i = 0; i < tamanho; ++i) {
            System.out.print(a[i] + " ");
        }

    }
}