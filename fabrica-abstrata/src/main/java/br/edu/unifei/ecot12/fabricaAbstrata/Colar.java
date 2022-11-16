package br.edu.unifei.ecot12.fabricaAbstrata;

public abstract class Colar {
	private float tamanho;
	private int tatalArgolas;
	
	public Colar() {}
	
	public float getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getTatalArgolas() {
		return tatalArgolas;
	}
	
	public void setTatalArgolas(int tatalArgolas) {
		this.tatalArgolas = tatalArgolas;
	}
}
