package entities;

public class BombaCombustivel {
    // tipo de combustível, valor por litro e quantidade de combustível.
    private String tipoDeCombustivel;
    private Double valorPorLitro;
    private Double quantidadeDeCombustivel;

    public BombaCombustivel(String tipoDeCombustivel, Double valorPorLitro, Double quantidadeDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public Double abastecerPorValor(Double amount) {
        Double litrosColocados = amount / valorPorLitro;
        quantidadeDeCombustivel -= litrosColocados;
        return litrosColocados;
    }
    public Double abastecerPorLitro(Double amount) {
        Double valorPago = amount * valorPorLitro;
        quantidadeDeCombustivel -= amount;
        return valorPago;
    }
    public void alterarValor(Double amount) {
        valorPorLitro = amount;
    }
    public void alterarCombustivel(String combustivel) {
        tipoDeCombustivel = combustivel;
    }
    public void alterarQuantidadeCombustivel(Double amount) {
        quantidadeDeCombustivel = amount;
    }

    @Override
    public String toString() {
        return "\n============================"
                +"\n--- BOMBA DE COMBUSTIVEL --- "
                +"\nTipo de combustivel: "+tipoDeCombustivel
                +"\nQuantidade disponivel: "+quantidadeDeCombustivel 
                +"\nValor por litro: "+valorPorLitro
                +"\n============================";
    }
    
}
