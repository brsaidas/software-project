package br.edu.unifei.ecot12.empreiteiro;

public class Cavaleiro extends Ser {

	private String nome;
	private Armadura armadura;

	public Cavaleiro() {
		this.setVida(500);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
}
