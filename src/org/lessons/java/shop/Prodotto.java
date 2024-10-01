
/*Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva*/



/* Usate opportunamente attributi ed altri metodi per fare in modo che:
- ci sia un metodo che valorizzi il codice prodotto con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
*/

package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
	
	    // Dichiarazione attributi del prodotto
	    private int code;
	    private String name;
	    private double prezzoBase;
	    private double iva;

	    // Inizializzazione attributi del prodotto
	    public Prodotto(String nome, double prezzoBase, double iva) {
	        this.name = nome;
	        this.prezzoBase = prezzoBase;
	        this.iva = iva;
	        this.code = generaCodice();
	    }

	    // Metodo per generare un codice casuale
	    private int generaCodice() {
	        Random random = new Random();
	        return random.nextInt(10000);  // Genera un numero random da 0 a 9999
	    }

	    // Metodo per ottenere il prezzo base
	    public double getPrezzoBase() {
	        return prezzoBase;
	    }

	    // Metodo per ottenere il prezzo comprensivo di IVA
	    public double getPrezzoConIva() {
	        return prezzoBase + (prezzoBase * iva / 100);
	    }

	    // Metodo per ottenere il nome esteso (codice-nome)
	    public String getNomeEsteso() {
	        return code + "-" + name;
	    }
	    
	    
	    
	    
	    /*public class Main {
	    	
		    public static void main(String[] args) {
		        // Creazione di un nuovo prodotto
		        Prodotto prodotto = new Prodotto("Laptop", 1000.00, 22.0);

		        // Test delle funzionalità della classe Prodotto
		        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
		        System.out.println("Prezzo base: " + prodotto.getPrezzoBase() + " €");
		        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva() + " €");
		    }*/
		}

