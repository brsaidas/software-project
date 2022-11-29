package br.edu.unifei.ecot12.interpretador;

public class App {

	public static void main(String args[]) {
		Expressao p1 = new Terminal("Joao");
		Expressao p2 = new Terminal("Maria");
		Expressao ehLivre = new ExpressaoOr(p1, p2);
		
		Expressao p3 = new Terminal("Romeu");
		Expressao p4 = new Terminal("Julieta");
		Expressao ehCasal = new ExpressaoAnd(p3, p4);
		
		System.out.println(ehLivre.interpretar("Joao"));
		System.out.println(ehLivre.interpretar("Maria"));
		System.out.println(ehLivre.interpretar("José"));
	
		System.out.println(ehCasal.interpretar("Romeu Julieta"));
		System.out.println(ehCasal.interpretar("João Maria"));
		System.out.println(ehCasal.interpretar("Julieta Romeu"));
	}
	
}
