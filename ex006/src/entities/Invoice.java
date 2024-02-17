package entities;

public class Invoice {
    private int numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    public Invoice(int numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidade = Math.max(0, quantidade);  // Configura a quantidade como 0 se for negativa
        this.precoUnitario = Math.max(0.0, precoUnitario);  // Configura o preço como 0.0 se for negativo
    }

    // Getters
    public int getNumeroItem() {
        return numeroItem;
    }
    public String getDescricaoItem() {
        return descricaoItem;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    // Setters
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = Math.max(0, quantidade);
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = Math.max(0.0, precoUnitario);
    }

    // Método para calcular o valor da fatura
    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }

}
