package org.java.events;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento{
	private LocalTime orario;
	private BigDecimal prezzo;
	
	public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime orario, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);
		
		setOrario(orario);
		setPrezzo(prezzo);
		
	}

	public LocalTime getOrario() {
		return orario;
	}

	public void setOrario(LocalTime orario) {
		this.orario = orario;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		 DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		 LocalDateTime dataOrario = getData().atTime(getOrario());
		 String dataOraFormattati = dataOrario.format(dataFormatter);
		 
		 DecimalFormat prezzoFormatter = new DecimalFormat("##,##0.00€");
		 String prezzoFormattato = prezzoFormatter.format(getPrezzo());
		 
		 return dataOraFormattati + " - " + getTitolo() + " - " + prezzoFormattato; 
	}
	
	
}
