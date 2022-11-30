package br.edu.unifei.ecot12.decoracao;

public abstract class Sorvete {

	private float custo;
	
	public abstract float preco();

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}
	
}
