package entities;

public class Aluno {

    private Integer matricula;
    private String nome;
    private Double notaProva1;
    private Double notaProva2;
    private Double notaTrabalho;
    private Double media;

// ---------------------------------------------    CONSTRUTOR
    public Aluno(Integer matricula, String nome, Double notaProva1, Double notaProva2, Double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }
// ---------------------------------------------    MÉTODOS
    public Double media() {
        media = (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2) / 7.0;
        return media;
    }
    public Double provaFinal() {
       // Calcula a nota necessária para a prova final

       if (media != null && media < 6.0) {
           // Se a média atual for menor que 6.0, calcula a nota necessária para atingir a média 6.0
           Double notaNecessaria = 12.0 - media;
           return notaNecessaria;
       } else {
           // Se a média atual já for maior ou igual a 6.0, não é necessário fazer a prova final
           return 0.0;
       }
    }
    @Override
    public String toString() {
        return " RESUMO -------------- " 
            + "\nAluno: " + nome 
            + "\nMatricula: " + matricula 
            + "\nNota da primeira prova: " + notaProva1 
            + "\nNota da segunda prova: " + notaProva2 
            + "\nNota do trabalho: " + notaTrabalho 
            + "\nMedia: " + media 
            + "\nNecessário na PF: "+ provaFinal();
    }  
}