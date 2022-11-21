package br.edu.unifei.ecot12.comando;

public class Desligar implements Comando {

	private Luz luz;
	
	public Desligar(Luz luz) {
		this.luz = luz;
	}

	public void executar() {
		luz.desligar();
	}
	
}
