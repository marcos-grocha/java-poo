package app;

import entities.Funcionario;

/* 7. A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as três informações a seguir como atributos:
        a. um primeiro nome,
        b. um sobrenome
        c. um salário mensal
    Sua classe deve ter um construtor que inicializa os três atributos. 
    Forneça os métodos getters e setters para cada atributo. 
    Se o salário mensal não for positivo, configure-o como 0.0. 
    Escreva um aplicativo de teste que demonstra as capacidades da classe. 
    Crie duas instâncias da classe e exiba o salário anual de cada instância. 
    Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
    empregado.
 */
public class App {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marcos", "Goulart", 12.500);
        Funcionario f2 = new Funcionario("Marcos", "Guimaraes", 3.500);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        
        f1.aumentoSalarial();
        f2.aumentoSalarial();
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
