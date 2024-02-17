package entities;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private Double salarioMensal;
    public Funcionario(String nome, String sobrenome, Double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = Math.max(0, salarioMensal);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Double salarioAnual() {
        double anual = salarioMensal * 13;
        return anual;
    }
    public void aumentoSalarial() {
        salarioMensal += salarioMensal * 0.10;
    }
    @Override
    public String toString() {
        return "\nFuncionario " 
            + "\nNome: " + nome 
            + "\nSobrenome: " + sobrenome 
            + "\nSalario Mensal: " + salarioMensal 
            + "\nSalario Anual: " + salarioAnual();
    }
    
}
