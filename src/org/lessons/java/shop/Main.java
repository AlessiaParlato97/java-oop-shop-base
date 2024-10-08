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
	
	
	/*
	public class Main {
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();
        
        Studente studente1 = new Studente("Alessia", "Parlato", 27);
        Studente studente2 = new Studente("Arlo", "Arlecchino",7);
        
        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        
        registro.stampaListaStudenti();
    }
}
*/
}


