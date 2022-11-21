package br.edu.unifei.ecto12.estrategia;

public class Variancia implements Estatistica {

	public double calcular(double[] v) {
		double soma = 0;
		double media = new Media().calcular(v);
		for (double e : v) {
			soma += Math.pow(e - media, 2.0);
		}
		return soma/v.length;
	}

}
