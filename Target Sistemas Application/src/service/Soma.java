package service;

public class Soma {
    private Integer k = 1;
    private Integer soma = 0;

    public void menu() {
        for (int indice = 12; k < indice;) {
            k += 1;
            soma += k;
            System.out.print(soma + " - ");
        }

        System.out.println("\nAo final das iterações o valor da variável SOMA é " + soma);
    }
}
