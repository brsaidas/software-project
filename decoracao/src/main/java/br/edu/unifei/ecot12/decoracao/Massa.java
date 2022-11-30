package br.edu.unifei.ecot12.decoracao;

public class Massa extends Sorvete {

	private String sabor;
	
	@Override
	public float preco() {
		// TODO Auto-generated method stub
		return getCusto() * 1.2f;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
