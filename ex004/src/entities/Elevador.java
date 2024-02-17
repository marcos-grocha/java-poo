package entities;

public class Elevador {

    private int andar = 0;
    private int andarAtual = 0;
    private int capacidade = 0;
    private int capacidadeAtual = 0;

    public void inicializa(Integer capacidade, Integer andar) {
        this.capacidade = capacidade;
        this.andar = andar;
    }

    public String entra() {
        if (capacidadeAtual < capacidade) {
            capacidadeAtual += 1;
            return "Entrou";
        } else {
            return "ELEVADOR LOTADO";
        }
    }
    public String sai() {
        if (capacidadeAtual != 0) {
            capacidadeAtual -= 1;
            return "Saiu";
        } else {
            return "ELEVADOR VAZIO";
        }
    }
    public String sobe() {
        if (andarAtual != andar) {
            andarAtual += 1;
            return "Sobe";
        } else {
            return "ULTIMO ANDAR";
        }
    }
    public String desce() {
        if (andarAtual != 0) {
            andarAtual -= 1;
            return "Desce";
        } else {
            return "TERREO";
        }
    }

    @Override
    public String toString() {
        return "\n==========================="
            + "\n- INFORMACOES DO ELEVADOR - "
            + "\nAndar atual: " + andarAtual 
            + "\nCapacidade usada: " + capacidadeAtual
            + "\n\nTotal de andares: " + andar 
            + "\nCapacidade total: " + capacidade
            + "\n===========================";
    }
    
}
