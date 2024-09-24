package service;

import java.util.Scanner;

public class OcorrenciaString {
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Digite uma String para verificar a ocorrência da letra a: ");
        String string = scanner.nextLine();

        Integer qtdOcorrencias = verificarString(string);
        System.out.println("A letra a aparece " + qtdOcorrencias + "vezes na String.");
    }

    private Integer verificarString(String string) {
        int contagem = 0;
        for (int i = 0; i < string.length(); i++) {
            Character caracter = string.toLowerCase().charAt(i);
            if (caracter.equals('a')) {
                contagem++;
            }
        }
        return contagem;
    }
}
