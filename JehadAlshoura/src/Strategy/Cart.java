package Strategy;

public class Cart {
    
    private double valor;
    private DescontoStrategy strategy;

    public Cart(double valor, DescontoStrategy strategy) {
        this.valor = valor;
        this.strategy = strategy;
    }

    public void setDescontoStrategy(DescontoStrategy strategy) {
        this.strategy = strategy;
    }
    public double calcularTotal() {
        return strategy.aplicarDesconto(valor);
    }

    public double total() {
        return strategy.aplicarDesconto(valor);
    }
}
