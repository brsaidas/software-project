package br.edu.unifei.ecto12.estrategia;

import java.util.Random;

public class App {

	public static void main(String args[]) {
		Random r = new Random();
		Conjunto c = new Conjunto();
		c.setEstatistica(new Variancia());
		c.setElementos(new double[100]);
		for (int i = 0; i < 100; i++) {
			c.getElementos()[i] = r.nextDouble() * 100;
		}
		System.out.println("Analise = " + c.analisar());
	}
	
}
