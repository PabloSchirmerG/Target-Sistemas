package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    private List<Integer> sequenciaFibonacci = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        for (int i = 0; i < 30; i++) {
            sequenciaFibonacci.add(calcularFibonacci(i));
        }

        System.out.println("Informe um número para verificar se ele pertence a sequência Fibonacci: ");
        var numero = scanner.nextInt();
        scanner.nextLine();

        if (sequenciaFibonacci.contains(numero)) {
            System.out.println("O número " + numero + " pertence a sequência Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência Fibonacci.");
        }
    }

    private Integer calcularFibonacci(Integer i) {
        return (i < 2) ? i : calcularFibonacci(i - 1) + calcularFibonacci(i - 2);
    }
}
