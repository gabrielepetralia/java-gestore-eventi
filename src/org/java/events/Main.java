package org.java.events;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
//		System.out.println("Inserisci un nuovo concerto ->");
//		
//		System.out.print("Titolo: ");
//		String titolo = sc.nextLine();
//		
//		System.out.println("Data e orario ->");
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
//		System.out.print("Ore: ");
//		int ore = Integer.valueOf(sc.nextLine());
//		
//		System.out.print("Minuti: ");
//		int minuti = Integer.valueOf(sc.nextLine());
//		
//		LocalDate data = LocalDate.of(anno, mese, giorno);
//		LocalTime orario = LocalTime.of(ore, minuti);
//		
//		System.out.print("Posti totali: ");
//		int postiTotali = Integer.valueOf(sc.nextLine());
//		
//		System.out.print("Prezzo: ");
//		String strPrezzo = sc.nextLine();
//		BigDecimal prezzo = new BigDecimal(strPrezzo);
//		
//		Evento newConcerto = null;
//		
//		try {
//			newConcerto = new Concerto(titolo, data, postiTotali, orario, prezzo);
//		} catch (Exception e) {
//			System.err.println("\nDati evento non validi: " + e.getMessage());
//		}
//		
//		if(newConcerto != null) System.out.println("\nConcerto: " + newConcerto.toString() + "\n");
//		
//		sc.close();
		
		
		//---------------- Programma Eventi ---------------------
		
		System.out.print("Inserisci il titolo del programma: ");
		String titoloProgramma = sc.nextLine();
		
		ProgrammaEventi newProgramma = new ProgrammaEventi(titoloProgramma);
		
//		System.out.print("\nQuanti eventi vuoi inserire nel programma? ");
//		int numEventi = Integer.valueOf(sc.nextLine());
//		
//		for(int i=0; i<numEventi; i++) {
//			System.out.println("\nEvento " + (i+1));
//			
//			System.out.print("Scegli tra: [1]Evento generico - [2]Concerto - [3]Spettacolo -> ");
//			String option = sc.nextLine();
//			
//			if (!Arrays
//					.asList(new String[] {"1", "2", "3"})
//					.contains(option)) {
//				System.err.println("Opzione non disponibile, riprova");
//				i--;
//				continue;
//			}
//			
//			System.out.print("\nTitolo: ");
//			String titolo = sc.nextLine();
//			
//			System.out.println("Data ->");
//			
//			System.out.print("Giorno: ");
//			int giorno = Integer.valueOf(sc.nextLine());
//			
//			System.out.print("Mese: ");
//			int mese = Integer.valueOf(sc.nextLine());
//			
//			System.out.print("Anno: ");
//			int anno = Integer.valueOf(sc.nextLine());
//			
//			LocalDate data = LocalDate.of(anno, mese, giorno);
//			
//			System.out.print("Posti totali: ");
//			int postiTotali = Integer.valueOf(sc.nextLine());
//			
//			Evento newEvento = null;
//			
//			if(!option.equals("1")) {
//				System.out.print("Prezzo: ");
//				String strPrezzo = sc.nextLine();
//				BigDecimal prezzo = new BigDecimal(strPrezzo);
//				
//				if(option.equals("3")) {
//					try {
//						newEvento = new Spettacolo(titolo, data, postiTotali, prezzo);
//						newProgramma.addEvento(newEvento);
//					} catch (Exception e) {
//						System.err.println("\nDati evento non validi: " + e.getMessage());
//						i--;
//						continue;
//					}
//				} else {
//					System.out.println("Orario ->");
//					
//					System.out.print("Ore: ");
//					int ore = Integer.valueOf(sc.nextLine());
//					
//					System.out.print("Minuti: ");
//					int minuti = Integer.valueOf(sc.nextLine());
//					
//					LocalTime orario = LocalTime.of(ore, minuti);
//					
//					try {
//						newEvento = new Concerto(titolo, data, postiTotali, orario, prezzo);
//						newProgramma.addEvento(newEvento);
//					} catch (Exception e) {
//						System.err.println("\nDati evento non validi: " + e.getMessage());
//						i--;
//						continue;
//					}
//				}	
//			} else {
//				try {
//					newEvento = new Evento(titolo, data, postiTotali);
//					newProgramma.addEvento(newEvento);
//				} catch (Exception e) {
//					System.err.println("\nDati evento non validi: " + e.getMessage());
//					i--;
//					continue;
//				}
//			}
//			
//		}
//		
//		System.out.println("\nNel programma " + newProgramma.getTitolo() + " sono presenti " + newProgramma.countEventi() + " eventi\n");
		
		try {
		Evento evento1 = new Evento("Evento 1", LocalDate.of(2023, 10, 15), 100);
        Evento evento2 = new Concerto("Concerto 2", LocalDate.of(2023, 11, 5), 150,LocalTime.of(19, 0), new BigDecimal("75.00"));
        Evento evento3 = new Spettacolo("Spettacolo 3", LocalDate.of(2023, 12, 20), 80, new BigDecimal("40.00"));
        Evento evento4 = new Concerto("Concerto 4", LocalDate.of(2024, 1, 10), 120, LocalTime.of(20, 0), new BigDecimal("60.00"));
        Evento evento5 = new Evento("Evento 5", LocalDate.of(2024, 2, 14), 200);
        Evento evento6 = new Spettacolo("Spettacolo 6", LocalDate.of(2024, 3, 5), 80, new BigDecimal("45.00"));
        Evento evento7 = new Concerto("Concerto 7", LocalDate.of(2024, 3, 5), 80, LocalTime.of(18, 0), new BigDecimal("50.00"));
        newProgramma.addEvento(evento1);
        newProgramma.addEvento(evento2);
        newProgramma.addEvento(evento3);
        newProgramma.addEvento(evento4);
        newProgramma.addEvento(evento5);
        newProgramma.addEvento(evento6);
        newProgramma.addEvento(evento7);
		} catch (Exception e) {
			System.err.println("\nDati evento non validi: " + e.getMessage());
		}
		
		System.out.print("\n");
		
		System.out.println(newProgramma.printProgramma());
		
		
		// Media prezzi
		
		System.out.println("\n--------------------------------------------------\n");
		
		String optionMedia = null;
		
		while(true) {
			System.out.print("Scegli il tipo di eventi di cui vuoi calcolare la media dei prezzi: [1]Tutti gli Eventi - [2]Concerti - [3]Spettacoli -> ");
			optionMedia = sc.nextLine();
			
			if (!Arrays
					.asList(new String[] {"1", "2", "3"})
					.contains(optionMedia)) {
				System.err.println("Opzione non disponibile, riprova");
			} else {
				break;
			}
		}
		
		switch(optionMedia) {
			case "2": 
				System.out.println("\nLa media dei prezzi dei concerti è: " + 
									newProgramma.mediaPrezzoTipoEvento("Concerto") + "€");
				break;
			case "3": 
				System.out.println("\nLa media dei prezzi degli spettacoli è: " + 
									newProgramma.mediaPrezzoTipoEvento("Spettacolo") + "€");
				break;	
			default: 
				System.out.println("\nLa media dei prezzi di tutti gli eventi è: " + 
						newProgramma.mediaPrezzoTipoEvento("Evento") + "€");
				break;
		}
		
		
		// Filtro per data
		
//		System.out.println("\n--------------------------------------------------\n");
//		
//		
//		System.out.println("Inserisci una data per cui vuoi filtrare gli eventi ->");
//		
//		System.out.print("Giorno: ");
//		int giornoFilter = Integer.valueOf(sc.nextLine());
//		
//		System.out.print("Mese: ");
//		int meseFilter = Integer.valueOf(sc.nextLine());
//		
//		System.out.print("Anno: ");
//		int annoFilter = Integer.valueOf(sc.nextLine());
//		
//		sc.close();
//		
//		LocalDate dataFilter = LocalDate.of(annoFilter, meseFilter, giornoFilter);
//		
//		List<Evento> eventiAtDate = newProgramma.eventiAtDate(dataFilter);
//
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String dataFilterFormattata = dataFilter.format(formatter);
//		
//		System.out.println("\nEventi in data " + dataFilterFormattata + ": " + eventiAtDate);
	
		
		// Svuoto la lista eventi
		
//		System.out.println("\n--------------------------------------------------\n");
//		
//		
//		newProgramma.clearEventi();
//		
//		System.out.println("Lista eventi svuotata\n");
//		
//		System.out.println("Nel programma " + newProgramma.getTitolo() + " sono presenti " + newProgramma.countEventi() + " eventi\n");
	}
}
