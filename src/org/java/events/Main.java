package org.java.events;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//---------------- Evento Generico ---------------------
		
//		System.out.println("Inserisci un nuovo evento ->");
//		
//		System.out.print("Titolo: ");
//		String titolo = sc.nextLine();
//		
//		System.out.print("Giorno: ");
//		int giorno = Integer.valueOf(sc.nextLine());
//		
//		System.out.print("Mese: ");
//		int mese = Integer.valueOf(sc.nextLine());
//		
//		System.out.print("Anno: ");
//		int anno = Integer.valueOf(sc.nextLine());
//		
//		LocalDate data = LocalDate.of(anno, mese, giorno);
//		
//		System.out.print("Posti totali: ");
//		int postiTotali = Integer.valueOf(sc.nextLine());
//		
//		Evento newEvento = null;
//		
//		try {
//			newEvento = new Evento(titolo, data, postiTotali);
//		} catch (Exception e) {
//			System.err.println("\nDati evento non validi: " + e.getMessage());
//		}
//		
//		if(newEvento != null) System.out.println("\nEvento: " + newEvento.toString() + "\n");
//		
//		System.out.print("Quante prenotazioni vuoi fare? ");
//		int numPrenotazioni = Integer.valueOf(sc.nextLine());
//		
//		try {
//			for(int i=0; i<numPrenotazioni; i++) {
//				newEvento.prenota();
//			}
//		} catch (Exception e) {
//			System.err.println("\nErrore nelle prenotazioni: " + e.getMessage());
//		}
//		
//		System.out.println("\nPosti prenotati: " + newEvento.getPostiPrenotati() + " | " + 
//							"Posti disponibili: " + (newEvento.getPostiTotali() - newEvento.getPostiPrenotati()) + "\n");
//		
//		System.out.print("Quante prenotazioni vuoi disdire? ");
//		int numDisdette = Integer.valueOf(sc.nextLine());
//		
//		try {
//			for(int i=0; i<numDisdette; i++) {
//				newEvento.disdici();
//			}
//		} catch (Exception e) {
//			System.err.println("\nErrore nelle disdette: " + e.getMessage());
//		}
//		
//		System.out.println("\nPosti prenotati: " + newEvento.getPostiPrenotati() + " | " + 
//							"Posti disponibili: " + (newEvento.getPostiTotali() - newEvento.getPostiPrenotati()) + "\n");
//		
//		sc.close();
		
		
		//---------------- Concerto ---------------------
		
		System.out.println("Inserisci un nuovo concerto ->");
		
		System.out.print("Titolo: ");
		String titolo = sc.nextLine();
		
		System.out.println("Data e orario ->");
		
		System.out.print("Giorno: ");
		int giorno = Integer.valueOf(sc.nextLine());
		
		System.out.print("Mese: ");
		int mese = Integer.valueOf(sc.nextLine());
		
		System.out.print("Anno: ");
		int anno = Integer.valueOf(sc.nextLine());
		
		System.out.print("Ore: ");
		int ore = Integer.valueOf(sc.nextLine());
		
		System.out.print("Minuti: ");
		int minuti = Integer.valueOf(sc.nextLine());
		
		LocalDate data = LocalDate.of(anno, mese, giorno);
		LocalTime orario = LocalTime.of(ore, minuti);
		
		System.out.print("Posti totali: ");
		int postiTotali = Integer.valueOf(sc.nextLine());
		
		System.out.print("Prezzo: ");
		String strPrezzo = sc.nextLine();
		BigDecimal prezzo = new BigDecimal(strPrezzo);
		
		Evento newConcerto = null;
		
		try {
			newConcerto = new Concerto(titolo, data, postiTotali, orario, prezzo);
		} catch (Exception e) {
			System.err.println("\nDati evento non validi: " + e.getMessage());
		}
		
		if(newConcerto != null) System.out.println("\nEvento: " + newConcerto.toString() + "\n");
		
		sc.close();
	}
}
