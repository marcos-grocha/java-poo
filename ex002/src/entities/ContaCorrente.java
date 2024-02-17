package entities;

public class ContaCorrente {

    private Integer numeroDaConta;
    private String nomeDoCorrentista;
    private Double saldo = 0.0;

    public ContaCorrente(Integer numeroDaConta, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public void alterarNome(String novoNome) {
        nomeDoCorrentista = novoNome;
    }
    public void deposito(Double amount) {
        saldo += amount;
    }
    public void saque(Double amount) {
        saldo -= amount;
    }
    @Override
    public String toString() {
        return "--------------------------------"
                +"\n   === DADOS DA CONTA ===" 
                + "\nNome do correntista: "+ nomeDoCorrentista 
                + "\nNumero da conta: "+ numeroDaConta 
                + "\nSaldo atual: "+ saldo
                + "\n--------------------------------";
    }
   
}
