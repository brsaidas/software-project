package br.edu.unifei.ecot12.prototipo;

import java.util.Date;

public class Conserto {
	
	private Date data;
	private Midia midia;
	
	public void reparar() {
		if (midia != null) {
			midia = midia.clone();
		}
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

}
