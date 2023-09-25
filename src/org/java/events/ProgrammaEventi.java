package org.java.events;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammaEventi {
	private String titolo;
	private List<Evento> eventi;
	
	public ProgrammaEventi(String titolo) {
		setTitolo(titolo);
		setEventi(new ArrayList<>());
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	//--------------------------------------------------
	
	public void addEvento(Evento evento) {
		eventi.add(evento);
	}
	
	public List<Evento> eventiAtDate(LocalDate data) {
//		List<Evento> eventiAtDate = new ArrayList<>();
//		
//		for (Evento evento : eventi) {
//		    if(evento.getData().isEqual(data)) {
//		    	eventiAtDate.add(evento);
//		    }
//		}
//		
//		return eventiAtDate;
		
		// Lambda function
		return eventi.stream()
	            .filter(evento -> evento.getData().isEqual(data))
	            .toList();
	}
	
	public int countEventi() {
		return eventi.size();
	}
	
	public void clearEventi() {
		eventi.clear();
	}
	
	public String printProgramma() {
		String strProgramma = "Programma " + getTitolo() + ": \n";
		
		Collections.sort(eventi, Comparator.comparing(Evento::getData));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
//		for (Evento evento : eventi) {
//			strProgramma += "- " + evento.getData() + " - " + evento.getTitolo() + "\n";
//		}
		
		// Lambda function
		strProgramma += eventi.stream()
	    .map(evento -> "- " + evento.getData().format(formatter) + " - " + evento.getTitolo() + " - " + evento.getClass().getSimpleName())
	    .collect(Collectors.joining("\n"));
											
		return strProgramma;		
	}
	
	public BigDecimal mediaPrezzoTipoEvento (String TipoEvento) {
		BigDecimal mediaPrezzo = BigDecimal.ZERO;
		int count=0;
		
		switch (TipoEvento) {
			case "Concerto":
				for (Evento evento : eventi) {
					if(evento instanceof Concerto) {
						Concerto concerto = (Concerto) evento;
						mediaPrezzo = mediaPrezzo.add(concerto.getPrezzo());
						count++;
					}
				}
				break;
				
			case "Spettacolo":
				for (Evento evento : eventi) {
					if(evento instanceof Spettacolo) {
						Spettacolo spettacolo = (Spettacolo) evento;
						mediaPrezzo = mediaPrezzo.add(spettacolo.getPrezzo());
						count++;
					}
				}
				break;
				
			case "Evento":
				for (Evento evento : eventi) {
					if(evento instanceof Concerto) {
						Concerto concerto = (Concerto) evento;
						mediaPrezzo = mediaPrezzo.add(concerto.getPrezzo());
						count++;
					}
					
					if(evento instanceof Spettacolo) {
						Spettacolo spettacolo = (Spettacolo) evento;
						mediaPrezzo = mediaPrezzo.add(spettacolo.getPrezzo());
						count++;
					}
				}
		}
		
		mediaPrezzo = mediaPrezzo.divide(new BigDecimal(count));
		
		return mediaPrezzo;
	}
	
}
