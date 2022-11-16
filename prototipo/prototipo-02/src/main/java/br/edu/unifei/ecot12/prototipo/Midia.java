package br.edu.unifei.ecot12.prototipo;

public abstract class Midia {
	
	private String titulo;
	
	public abstract Midia clone();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	};
	
}
