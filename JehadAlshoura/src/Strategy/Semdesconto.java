package Strategy;

public class Semdesconto implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor) {
        return valor;
    }
}