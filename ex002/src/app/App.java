package app;

import java.util.Scanner;

import entities.ContaCorrente;

/*
 * Crie uma classe para implementar uma ContaCorrente. 
 *      A classe deve possuir os seguintes atributos:
 *      número da conta, nome do correntista e saldo. 
 * Os métodos são os seguintes: alterarNome, depósito e saque; 
 * No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Bancário!");

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o nome do correntista: ");
        String nomeCorrentista = scanner.next();

        ContaCorrente conta = new ContaCorrente(numeroConta, nomeCorrentista);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMENU DE OPCOES: ");
            System.out.println("1 - Realizar depósito");
            System.out.println("2 - Realizar saque");
            System.out.println("3 - Alterar nome do correntista");
            System.out.println("4 - Encerrar");
            System.out.print("DIGITE A OPCAO DESEJADA: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.deposito(valorDeposito);

                    System.out.println(conta);
                    break;
                case 2:
                    System.out.print("\nDigite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.saque(valorSaque);

                    System.out.println(conta);
                    break;
                case 3:
                    System.out.print("\nDigite o novo nome do correntista: ");
                    String novoNome = scanner.next();
                    conta.alterarNome(novoNome);

                    System.out.println(conta);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("ERRO: Opçao inválida. Tente novamente.");
            }
        }

        System.out.println("\nFinalizado. Obrigado! :) ");
        scanner.close();        
    }
}
