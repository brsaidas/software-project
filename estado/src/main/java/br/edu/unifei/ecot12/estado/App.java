package br.edu.unifei.ecot12.estado;

public class App {

	public static void main(String args[]) {
		Livro l = new Livro();
		System.out.println(l.getEstado());
		l.alterar();
		System.out.println(l.getEstado());
	}
	
}
