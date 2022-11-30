package br.edu.unifei.ecot12.decoracao;

public class Batido extends Sorvete {

	private Sorvete sorvete;
	
	public Batido(Sorvete sorvete) {
		this.sorvete = sorvete;
	}
	
	@Override
	public float preco() {
		// TODO Auto-generated method stub
		return sorvete.preco();
	}

	public Sorvete getSorvete() {
		return sorvete;
	}

	public void setSorvete(Sorvete sorvete) {
		this.sorvete = sorvete;
	}	
	
}
