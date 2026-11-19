package Prototype;

public class Main {
    public static void main(String[] args) {
        Personagem base = new Personagem("Jehad", "jogador", 21,100,300);

        Personagem p1 = base.clone();
        p1.setNome("Zaupa");

        Personagem p2 = base.clone();
        p2.setNome("Daniel");

        Personagem p3 = base.clone();
        p3.setNome("Anaysa");

        System.out.println("---Personagem base---");
        base.exibir();

        System.out.println("\n---Personagens Clonados---");
        p1.exibir();
        p2.exibir();
        p3.exibir();
    }
}
