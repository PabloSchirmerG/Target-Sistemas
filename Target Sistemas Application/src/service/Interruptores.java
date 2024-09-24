package service;

public class Interruptores {

    public void menu() {
        String menu = """
                A solução mais lógica, dado 3 interruptores:        
                interruptor    |    interruptor   |    interruptor
                     1         |         2        |         3
                     
                Passo 1:
                Ligar o interruptor 1 e aguardar algum tempo considerável até que a lâmpada esquente.
                Passo 2: 
                Ligar o interruptor 2 e se dirigir rapidamente até a sala ao lado.
                Passo 3:
                Identificar a lâmpada que está mais quente, ela corresponde ao interruptor 1.
                Passo 4:
                Identificar a outra lâmpada acesa, ela corresponde ao interruptor 2.
                Passo 5: 
                Identificar a lâmpada apagada, ela corresponde ao interruptor 3.
                
                """;

        System.out.println(menu);
    }
}
