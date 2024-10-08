/*Snack 3: Registro Studenti
Crea una classe RegistroStudenti che rappresenti un registro di studenti.
Utilizza un array privato per memorizzare oggetti Studente.
Implementa un costruttore senza parametri per inizializzare il registro vuoto
e un metodo pubblico per aggiungere studenti al registro.
Aggiungi un metodo che stampi la lista degli studenti.*/


package org.lessons.java.shop;

public class RegistroStudenti {
	

	    // Array privato per memorizzare gli oggetti Studente
	    private Student[] student;
	    private int count;

	    // Costruttore senza parametri per inizializzare il registro vuoto
	    public RegistroStudenti() {
	        student = new Student[500]; // Dimensione massima del registro
	        count = 0;
	    }

	    // Metodo pubblico per aggiungere studenti al registro
	    public void aggiungiStudente(Student students) {
	        if (count < student.length) {
	            student[count] = students;
	            count++;
	            System.out.println("Studente aggiunto: " + students.getTotInfo());
	        } else {
	            System.out.println("Registro pieno, impossibile aggiungere lo studente.");
	        }
	    }

	    // Metodo per stampare la lista degli studenti
	    public void stampaListaStudenti() {
	        System.out.println("Lista degli studenti:");
	        for (int i = 0; i < count; i++) {
	            System.out.println(student[i].getTotInfo());
	        }
	    }
	}


