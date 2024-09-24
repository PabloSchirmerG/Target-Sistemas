package service;

public class Logica {

    public void menu() {
        String texto = """
                a) 1, 3, 5, 7, ...
                A lógica desta sequência é imprimir o próximo número ímpar.
                Próximo número: 9.
                
                b) 2, 4, 8, 16, 32, 64, ...
                A lógica da sequência é exibir a próxima potência de 2.
                Próximo número: 128.
                
                c) 0, 1, 4, 8, 16, 32, 64, ...
                A lógica é exibir o resultado de quadrados perfeitos.
                Próximo número: 49 (7 x 7)
                
                d) 4, 16, 36, 64, ...
                A lógica é exibir o resultado do quadrado de números pares.
                Próximo número: 100 (10 x 10)
                
                e) 1, 1, 2, 3, 5, 8, ...
                A lógica é seguir a sequência de Fibonacci.
                Próximo número: 13 (8 + 5)
                
                f) 2, 10, 12, 16, 17, 18, 19, ...
                A lógica é que cada um dos números quando escrito se inicia com a letra D
                Próximo número: 200 (Duzentos)
                """;

        System.out.println(texto);
    }
}
