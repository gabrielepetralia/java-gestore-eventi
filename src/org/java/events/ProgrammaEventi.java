package org.java.events;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		List<Evento> eventiAtDate = new ArrayList<>();
		
		for (Evento evento : eventi) {
		    if(evento.getData().isEqual(data)) {
		    	eventiAtDate.add(evento);
		    }
		}
		
		return eventiAtDate;
	}
	
	public int countEventi() {
		return eventi.size();
	}
	
	public void clearEventi() {
		eventi.clear();
	}
	
	public String printProgramma() {
		String strProgramma = "Programma: " + getTitolo() + "\n";
		
		Collections.sort(eventi, Comparator.comparing(Evento::getData));
		
		for (Evento evento : eventi) {
			strProgramma += "- " + evento.getData() + " - " + evento.getTitolo() + "\n";
		}
											
		return strProgramma;		
	}
	
}
