package br.edu.unifei.ecot12.metodoFabrica;

public class MontarHades implements MontagemDeus<Hades> {

	public Hades fabricaDeus() {
		Hades h = new Hades();
		h = new Hades();
		h.setVida(10000);
		h.setNumCavaleiros(3);
		h.setMorte(1000);
		return null;
	}
	
}
