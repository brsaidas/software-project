package br.edu.unifei.ecot12.metodoFabrica;

public class MontarZeus implements MontagemDeus<Zeus> {

	public Zeus fabricaDeus() {
		Zeus d = new Zeus();
		d.setVida(10000);
		d.setNumCavaleiros(10);
		d.setRaio(1000);
		return d;
	}
	
}
