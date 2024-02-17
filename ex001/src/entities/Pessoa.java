package entities;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataDeNascimento;
    private Double altura;

// -------------------------------------    CONSTRUTORES
    public Pessoa() {
    }
    public Pessoa(String nome, LocalDate dataDeNascimento, Double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }
// -------------------------------------    GETS E SETS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
// -------------------------------------       MÉTODOS
    public int calcularIdade() {
        // Obtém a data atual
        LocalDate hoje = LocalDate.now();
        // Calcula o período entre a data de nascimento e a data atual
        Period periodo = Period.between(dataDeNascimento, hoje);
        // Retorna a quantidade de anos no período, representando a idade
        return periodo.getYears();
    }
    @Override
    public String toString() {
        return "GERADOR DE INFORMAÇÕES"
                + "\nNome: "+ nome
                + "\nData de nascimento: "+ dataDeNascimento
                + "\nAltura: "+ altura
                + "\nIdade: "+ calcularIdade();
    }
}
