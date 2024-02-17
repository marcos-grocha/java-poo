package app;

import entities.Aluno;

/* 5. 
    Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
    * Cada objeto dessa classe deve guardar os seguintes dados do aluno: 
    ** matrícula, nome, 2 notas de prova e 1 nota de trabalho.

    Escreva os seguintes métodos para esta classe:
        a. media: calcula a média final do aluno 
            (cada prova tem peso 2,5 e o trabalho tem peso 2)
        b. final: calcula quanto o aluno precisa para a prova final 
            (retorna zero se ele não for para a final)
 */
public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(3, "Goulart", 5.5, 4.8, 8.0);
        aluno.media();
        System.out.println(aluno.toString());;        
    }
    
}
