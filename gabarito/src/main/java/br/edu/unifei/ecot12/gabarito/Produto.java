package br.edu.unifei.ecot12.gabarito;

public abstract class Produto {
	
	public double lucro() {
		return venda() - custo();
	}
	
	public abstract double custo();
	public abstract double venda();
	
}
