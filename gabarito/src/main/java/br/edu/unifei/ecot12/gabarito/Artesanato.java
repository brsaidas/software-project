package br.edu.unifei.ecot12.gabarito;

import java.util.ArrayList;
import java.util.List;

public class Artesanato extends Produto {

	private String nome;
	private List<Componente> componentes = new ArrayList<Componente>();
	
	@Override
	public double custo() {
		double s = 0;
		for (Componente c : componentes) {
			s += c.getValorCusto();
		}
		return s;
	}
	
	@Override
	public double venda() {
		double s = 0;
		for (Componente c : componentes) {
			s += c.getValorVenda();
		}
		return s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}
	
}
