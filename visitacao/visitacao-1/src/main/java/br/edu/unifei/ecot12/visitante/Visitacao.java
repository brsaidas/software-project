package br.edu.unifei.ecot12.visitante;

public interface Visitacao {
	
	public abstract boolean visitar(Texto t);
	public abstract boolean visitar(Panilha p);
	public abstract boolean visitar(Desenho d);
	
}
