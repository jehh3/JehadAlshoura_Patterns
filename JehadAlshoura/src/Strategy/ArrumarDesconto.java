package Strategy;

public class ArrumarDesconto implements DescontoStrategy {

    private double quantidade;
    public ArrumarDesconto(double quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public double aplicarDesconto(double valor) {
        return Math.max(0, valor - quantidade);
    }
}
