package br.edu.unifei.ecot12.decoracao;

public class Mix extends Batido {

	private String combinacao;
	
	public Mix(Sorvete sorvete) {
		super(sorvete);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float preco() {
		float t = super.preco() + getCusto();
		return t * 1.2f;
	}

	public String getCombinacao() {
		return combinacao;
	}

	public void setCombinacao(String combinacao) {
		this.combinacao = combinacao;
	}
	
}
