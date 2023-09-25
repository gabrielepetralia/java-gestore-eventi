package org.java.events;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un nuovo evento ->");
		
		System.out.print("Titolo: ");
		String titolo = sc.nextLine();
		
		System.out.print("Giorno: ");
		int giorno = Integer.valueOf(sc.nextLine());
		
		System.out.print("Mese: ");
		int mese = Integer.valueOf(sc.nextLine());
		
		System.out.print("Anno: ");
		int anno = Integer.valueOf(sc.nextLine());
		
		LocalDate data = LocalDate.of(anno, mese, giorno);
		
		System.out.print("Posti totali: ");
		int postiTotali = Integer.valueOf(sc.nextLine());
		
		Evento newEvento = null;
		
		try {
			newEvento = new Evento(titolo, data, postiTotali);
		} catch (Exception e) {
			System.err.println("\nDati evento non validi: " + e.getMessage());
		}
		
		if(newEvento != null) System.out.println("\nEvento: " + newEvento.toString() + "\n");
		
		System.out.print("Quante prenotazioni vuoi fare? ");
		int numPrenotazioni = Integer.valueOf(sc.nextLine());
		
		try {
			for(int i=0; i<numPrenotazioni; i++) {
				newEvento.prenota();
			}
		} catch (Exception e) {
			System.err.println("\nErrore nelle prenotazioni: " + e.getMessage());
		}
		
		System.out.println("\nPosti prenotati: " + newEvento.getPostiPrenotati() + " | " + 
							"Posti disponibili: " + (newEvento.getPostiTotali() - newEvento.getPostiPrenotati()) + "\n");
		
		System.out.print("Quante prenotazioni vuoi disdire? ");
		int numDisdette = Integer.valueOf(sc.nextLine());
		
		try {
			for(int i=0; i<numDisdette; i++) {
				newEvento.disdici();
			}
		} catch (Exception e) {
			System.err.println("\nErrore nelle disdette: " + e.getMessage());
		}
		
		System.out.println("\nPosti prenotati: " + newEvento.getPostiPrenotati() + " | " + 
							"Posti disponibili: " + (newEvento.getPostiTotali() - newEvento.getPostiPrenotati()) + "\n");
		
	}
}
