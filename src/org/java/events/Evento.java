package org.java.events;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	public Evento(String titolo, LocalDate data, int postiTotali) throws Exception {
		setTitolo(titolo);
		setData(data);
		setPostiTotali(postiTotali);
		setPostiPrenotati(0);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) throws Exception {
		LocalDate dataCorrente = LocalDate.now();
		
		if(data.isBefore(dataCorrente)) {
			throw new Exception("Non è possibile inserire una data già passata");
		}
			
		this.data = data;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	private void setPostiTotali(int postiTotali) throws Exception {
		if(postiTotali <= 0) {
			throw new Exception("I posti totali non possono essere 0 o inferiori");
		}
		
		this.postiTotali = postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	private void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}
	
	//--------------------------------------------------
	
	public LocalDate getDataCorrente() {
		return LocalDate.now();
	}
	
	public void prenota() throws Exception {
		
		if(getDataCorrente().isAfter(getData()) ){
			throw new Exception("Non puoi prenotare un evento già passato");
		}
		
		if(getPostiPrenotati() >= getPostiTotali() ){
			throw new Exception("I posti per questo evento sono terminati");
		}
		
		setPostiPrenotati(getPostiPrenotati() + 1);
	}
	
	public void disdici() throws Exception {
		
		if(getDataCorrente().isAfter(getData()) ){
			throw new Exception("Non puoi disdire un evento già passato");
		}
		
		if(getPostiPrenotati() <=0 ){
			throw new Exception("Non ci sono posti prenotati da disdire");
		}
		
		setPostiPrenotati(getPostiPrenotati() - 1);
	}
	
	@Override
	public String toString() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 return getData().format(formatter) + " - " + getTitolo(); 
	}

}
