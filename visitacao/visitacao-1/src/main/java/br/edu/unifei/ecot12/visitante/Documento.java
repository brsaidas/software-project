package br.edu.unifei.ecot12.visitante;

public abstract class Documento {

	private String nome;
	private String path;
	
	public abstract boolean aceitar(Visitacao v);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
