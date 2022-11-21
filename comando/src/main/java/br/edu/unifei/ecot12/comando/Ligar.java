package br.edu.unifei.ecot12.comando;

public class Ligar implements Comando {

	private Luz luz;
	
	public Ligar(Luz luz) {
		this.luz = luz;
	}

	public void executar() {
		luz.ligar();
	}
	
}
