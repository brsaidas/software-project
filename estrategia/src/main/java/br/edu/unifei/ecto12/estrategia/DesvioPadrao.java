package br.edu.unifei.ecto12.estrategia;

public class DesvioPadrao implements Estatistica {

	public double calcular(double[] v) {
		double var = new Variancia().calcular(v);
		return Math.sqrt(var);
	}
	
}
