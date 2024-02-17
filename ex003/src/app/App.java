package app;

import java.util.Scanner;

import entities.BombaCombustivel;

/* 3. 
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses atributos a classes deve conter os seguintes métodos.
        a. abastecerPorValor;   
            // método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
        b. abastecerPorLitro;   
            // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
        c. alterarValor;        
            // altera o valor do litro do combustível.
        d. alterarCombustivel;  
            // altera o tipo do combustível.
        e. alterarQuantidadeCombustivel; 
            //altera a quantidade de combustível restante na bomba.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SISTEMA BOMBA DE COMBUSTIVEL");

        System.out.print("Informe o tipo de combustivel: ");
        String tipo = scanner.next();
        System.out.print("Informe o valor por litro: ");
        Double valor = scanner.nextDouble();
        System.out.print("Informe a quantidade disponivel: ");
        Double quantidade = scanner.nextDouble();

        BombaCombustivel bomba1 = new BombaCombustivel(tipo, valor, quantidade);

        boolean continuar = true;

        while (continuar) {
            System.out.println(bomba1);
            System.out.println("\nMENU DE OPCOES: ");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar valor por litro");
            System.out.println("4 - Alterar tipo de combustivel");
            System.out.println("5 - Alterar quantidade disponivel");
            System.out.println("6 - Encerrar");
            System.out.print("DIGITE A OPCAO: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para abastecer: ");
                    System.out.println("Abastecendo: "+bomba1.abastecerPorValor(scanner.nextDouble())+" Litros");;
                    break;
                case 2:
                    System.out.print("Digite quantos litros para abastecer: ");
                    System.out.println("Abastecendo: "+bomba1.abastecerPorLitro(scanner.nextDouble())+" Reais");;
                    break;
                case 3:
                    System.out.print("Digite o novo valor por litro: ");
                    bomba1.alterarValor(scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Digite o novo tipo de combustivel: ");
                    bomba1.alterarCombustivel(scanner.next());
                    break;
                case 5:
                    System.out.print("Digite o novo valor disponivel: ");
                    bomba1.alterarQuantidadeCombustivel(scanner.nextDouble());
                    break;
                case 6:
                    continuar = false;
                    break;
            
                default:
                    System.out.println("ERRO: Opçao inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Sistema encerrado. Obrigado! :) ");
        scanner.close();
    }
}
