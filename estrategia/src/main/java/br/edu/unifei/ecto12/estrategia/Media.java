package br.edu.unifei.ecto12.estrategia;

public class Media implements Estatistica {

	public double calcular(double[] v) {
		double soma = 0;
		for (double e : v) {
			soma += e;
		}
		return soma/v.length;
	}

}
