package app;

import java.util.Scanner;

import entities.Elevador;

/* 4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar: 
    O andar atual (térreo = 0), Total de andares no prédio (desconsiderando o térreo Capacidade do elevador e Quantas pessoas estão presentes nele. 

    A classe deve também disponibilizar os seguintes métodos:
        a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio 
                (os elevadores sempre começam no térreo e vazio);
        b. Entra: para acrescentar uma pessoa no elevador 
                (só deve acrescentar se ainda houver espaço);
        c. Sai: para remover uma pessoa do elevador 
                (só deve remover se houver alguém dentro dele);
        d. Sobe: para subir um andar 
                (não deve subir se já estiver no último andar);
        e. Desce: para descer um andar 
                (não deve descer se já estiver no térreo);

 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador elevador = new Elevador();
        
        System.out.print("Digite a capacidade total do elevador: ");
        int capacidade = scanner.nextInt();
        System.out.print("Digite os andares totais do elevador: ");
        int andares = scanner.nextInt();
        elevador.inicializa(capacidade, andares);

        boolean continuar = true;
        while (continuar) {
            System.out.println(elevador);
            System.out.println("\nMENU DE OPCOES:");
            System.out.println("1 - Entra");
            System.out.println("2 - Sai");
            System.out.println("3 - Sobe");
            System.out.println("4 - Desce");
            System.out.println("5 - Encerrar");
            System.out.print("DIGITE A OPCAO: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(elevador.entra());
                    break;
                case 2:
                    System.out.println(elevador.sai());
                    break;
                case 3:
                    System.out.println(elevador.sobe());
                    break;
                case 4:
                    System.out.println(elevador.desce());
                    break;
                case 5:
                    continuar = false;
                    break;
            
                default:
                    System.out.println("ERRO: OpçAo inválida. Tente novamente.");
            }
        }
        System.out.println("Sistema encerrado, obrigado por usar! :) ");
        scanner.close();
    }
}
