package br.edu.unifei.ecot12.metodoFabrica;

public class MontarAtenas implements MontagemDeus<Atenas> {

	public Atenas fabricaDeus() {
		Atenas a = new Atenas();
		a.setVida(10000);
		a.setNumCavaleiros(12);
		a.setSabedoria(1000);
		return a;
	}

}
