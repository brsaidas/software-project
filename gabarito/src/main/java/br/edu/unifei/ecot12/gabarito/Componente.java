package br.edu.unifei.ecot12.gabarito;

public class Componente extends Produto {

	public double valorCusto;
	public double valorVenda;
	
	@Override
	public double custo() {
		return valorCusto;
	}

	@Override
	public double venda() {
		return valorVenda;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

}
