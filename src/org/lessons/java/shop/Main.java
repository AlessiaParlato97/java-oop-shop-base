package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
        // Creazione di un nuovo prodotto
        Prodotto prodotto = new Prodotto("MacBook Air", 1200.00, 22.0);

        // Test delle funzionalità della classe Prodotto
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase() + " €");
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva() + " €");

}
}
