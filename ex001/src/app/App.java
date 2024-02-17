package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Pessoa;

/*  1. 
    Crie uma classe para representar uma Pessoa com os atributos privados de 
nome, data de nascimento e altura. 
    Crie os métodos públicos necessários para getters e setters e também 
um método para imprimir todos dados de uma pessoa. 
    Crie um método para calcular a idade da pessoa. 
*/

public class App {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        pessoa1.setNome(sc.nextLine());

        System.out.print("Digite a data de nascimento (formato dd/MM/yyyy): ");
        // grava a data em uma String
        String dataProv1 = sc.nextLine();
        // transforma a String em um LocalDate
        LocalDate dataProv2 = LocalDate.parse(dataProv1, fmt);
        // seta o LocalDate na pessoa instanciada
        pessoa1.setDataDeNascimento(dataProv2);

        System.out.print("Digite a altura: ");
        pessoa1.setAltura(sc.nextDouble());

        System.out.println();
        System.out.print(pessoa1);

        sc.close();
    }
}
