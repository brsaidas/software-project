package br.edu.unifei.ecot12.estado;

import java.util.Date;

public class Emprestado implements Estado {
	
	private Date data;
	
	public void inverter(Livro l) {
		l.setEstado(new Disponivel());
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
