package Strategy;

public class PorcentagemDesconto implements DescontoStrategy {
    
    private double porcentagem;

    public PorcentagemDesconto(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor * (1 - porcentagem / 100);
    }
    
}
