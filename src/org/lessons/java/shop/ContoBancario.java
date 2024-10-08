/*Snack 2:Gestione di un Conto
Crea una classe ContoBancario con attributi per numero di conto e saldo.
Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero.
Aggiungi metodi pubblici per depositare denaro sul conto,
prelevare denaro dal conto
e ottenere il saldo corrente.*/



package org.lessons.java.shop;

public class ContoBancario {
	
	// Dichiaraizioni attributi
    private String numberConto;
    private double saldo;
    
    //Inizializzazione attributi del prodotto
    public ContoBancario(String numeroConto, double saldo) {
        this.numberConto = numeroConto;
        this.saldo = 0.0; // Inizializza il saldo a zero
    }

    //Metodo per depositare denaro sul conto
    public void deposita(double importo) {
    if (importo > 0) {
        saldo += importo;
        System.out.println("Deposito di " + importo + " effettuato. Saldo attuale: " + saldo);
    } else {
        System.out.println("L'importo del deposito deve essere positivo.");
    }
}

    // Metodo per prelevare denaro dal conto
    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato. Saldo attuale: " + saldo);
        } else if (importo > saldo) {
            System.out.println("Fondi insufficienti per prelevare " + importo + ".");
        } else {
            System.out.println("L'importo del prelievo deve essere positivo.");
        }
    }

    
    
    // Metodo per ottenere il saldo corrente
    public double getSaldo() {
        return saldo;
    }














}
