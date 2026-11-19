package Strategy;

public class Main {
    
    public static void main(String[] args) {

        Cart cart = new Cart(100, new Semdesconto());

        System.out.println("Total sem desconto: " + cart.calcularTotal());

        cart.setDescontoStrategy(new PorcentagemDesconto(20));
        System.out.println("Total com (20%) de desconto: " + cart.calcularTotal());

        cart.setDescontoStrategy(new ArrumarDesconto(15));
        System.out.println("Total com desconto fixo de 15: " + cart.calcularTotal());


    }
}
