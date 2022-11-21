package br.edu.unifei.ecot12.comando;

public class App {
	
	public static void main(String args[]) {
		Luz l = new Luz();
		Iluminacao i = new Iluminacao();
		i.getComandos().add(new Ligar(l));
		i.getComandos().add(new Desligar(l));
		i.getComandos().add(new Ligar(l));
		i.getComandos().add(new Desligar(l));
		i.getComandos().add(new Ligar(l));
		i.piscaPisca();
	}
	
}
