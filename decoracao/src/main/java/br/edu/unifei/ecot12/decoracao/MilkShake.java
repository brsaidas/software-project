package br.edu.unifei.ecot12.decoracao;

public class MilkShake extends Batido {

	private float leite;
	
	public MilkShake(Sorvete sorvete) {
		super(sorvete);
	}
	
	@Override
	public float preco() {
		float t = super.preco() + getCusto();
		return t * 1.3f;
	}

	public float getLeite() {
		return leite;
	}

	public void setLeite(float leite) {
		this.leite = leite;
	}
	
}
