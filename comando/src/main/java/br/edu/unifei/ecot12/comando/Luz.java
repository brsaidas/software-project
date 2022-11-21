package br.edu.unifei.ecot12.comando;

public class Luz {

	private int luminosidade;
	
	public void ligar() {
		System.out.print("[LIGAR]");
	}
	
	public void desligar() {
		System.out.print("[DESLIGAR]");
	}

	public int getLuminosidade() {
		return luminosidade;
	}

	public void setLuminosidade(int luminosidade) {
		this.luminosidade = luminosidade;
	}
	
}
