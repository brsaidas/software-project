package br.edu.unifei.ecot12.prototipo;

public class App {
	public static void main(String args[]) {
		Jogo j = new Jogo();
		j.setTitulo("minecraf");
		
		Jogo copia = (Jogo) j.clone();
	
		System.out.println("jogo = " + j + " copia = " + copia);
		
		Conserto c = new Conserto();
		c.setMidia(j);
		System.out.println(c.getMidia());
		c.reparar();
		System.out.println(c.getMidia());
	} 
}
