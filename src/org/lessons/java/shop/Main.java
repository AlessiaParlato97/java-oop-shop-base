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
	
	
	    /*public static void main(String[] args) {
	        ContoBancario conto = new ContoBancario("123456789");
	        conto.deposita(1000);
	        conto.preleva(500);
	        System.out.println("Saldo attuale: " + conto.getSaldo());
	    }
	}*/
}





/*Snack 3: Registro Studenti
Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare
oggetti Studente. Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico
per aggiungere studenti al registro. Aggiungi un metodo che stampi la lista degli studenti.*/





