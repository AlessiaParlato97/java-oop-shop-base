/*
Snack 1:
Studente
Scrivi una classe Studente con i seguenti attributi:
nome, cognome, età.
Implementa un costruttore che accetta tre parametri per inizializzare questi attributi.
Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).
*/


package org.lessons.java.shop;

public class Student {
	
	// Dichiaraizioni attributi
    private String name;
    private String surname;
    private int age;

 // Inizializzazione attributi del prodotto
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
}
    
    // Metodo che ritorna una stringa concatenata dei valori Student
    public String getTotInfo() {
        return this.name + " " + this.surname + ", " + this.age + " years old";
    }
    
    /* Oppure con il metodo concat:
    public String getTotInfo() {
        return this.name.concat(" ")
                        .concat(this.surname)
                        .concat(", ")
                        .concat(String.valueOf(this.age))  --> utilizzato per convertire l'età in una stringa e far funzionare il concat
                        .concat(" years old");
                        }*/
    }
    
