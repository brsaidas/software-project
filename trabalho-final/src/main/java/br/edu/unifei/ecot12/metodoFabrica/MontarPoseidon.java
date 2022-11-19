package br.edu.unifei.ecot12.metodoFabrica;

public class MontarPoseidon implements MontagemDeus<Poseidon> {

	public Poseidon fabricaDeus() {
		Poseidon p = new Poseidon();
		p.setVida(10000);
		p.setNumCavaleiros(5);
		p.setMar(1000);
		return p;
	}
	
}
