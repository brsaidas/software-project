package br.edu.unifei.ecot12.estado;

public class Livro {
	
	private String titulo;
	private String autor;
	private Estado estado = new Disponivel();
	
	public void alterar() {
		estado.inverter(this);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
