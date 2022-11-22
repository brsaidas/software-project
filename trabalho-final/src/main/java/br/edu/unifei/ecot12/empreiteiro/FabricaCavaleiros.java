package br.edu.unifei.ecot12.empreiteiro;

public class FabricaCavaleiros {
	
	private Producao producao;

	public Cavaleiro construir() {
		Cavaleiro c = new Cavaleiro();
		producao.contruirArmadura(c);
		return c;
	}

	public Producao getProducao() {
		return producao;
	}

	public void setProducao(Producao producao) {
		this.producao = producao;
	}
	
}
