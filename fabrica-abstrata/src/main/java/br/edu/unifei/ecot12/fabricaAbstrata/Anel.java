package br.edu.unifei.ecot12.fabricaAbstrata;

public abstract class Anel {
	private float tamanho;
	private String pedra;
	private int totalPedras;
	
	public Anel() {}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getPedra() {
		return pedra;
	}

	public void setPedra(String pedra) {
		this.pedra = pedra;
	}

	public int getTotalPedras() {
		return totalPedras;
	}

	public void setTotalPedras(int totalPedras) {
		this.totalPedras = totalPedras;
	}
}
