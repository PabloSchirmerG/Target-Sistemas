package main;

import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        OcorrenciaString ocorrenciaString = new OcorrenciaString();
        Soma soma = new Soma();
        Logica logica = new Logica();
        Interruptores interruptores = new Interruptores();

        int opcao = -1;

        String menu = """
                \n*** Selecione o exercício a ser avaliado: **** 
                
                1 - Sequência Fibonacci
                2 - Ocorrência da letra a em uma String
                3 - Loop de soma
                4 - Lógica do próximo elemento
                5 - Lampadas e interruptores
                
                0 - Sair
                \n""";

        while (opcao != 0) {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    fibonacci.menu();
                    break;
                case 2:
                    ocorrenciaString.menu();
                    break;
                case 3:
                    soma.menu();
                    break;
                case 4:
                    logica.menu();
                    break;
                case 5:
                    interruptores.menu();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}
