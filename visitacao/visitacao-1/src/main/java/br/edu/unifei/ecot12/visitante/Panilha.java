package br.edu.unifei.ecot12.visitante;

public class Panilha extends Documento {

	private boolean confidencial;
	private int ultimaLinha;
	private int ultimaColuna;
	
	public void ultimaPagina() {
		System.out.println("página 1");
	}
	
	public void multiplasPaginas() {
		System.out.println("página 1, 2, 3 ...");
	}
	
	@Override
	public boolean aceitar(Visitacao v) {
		// TODO Auto-generated method stub
		return v.visitar(this);
	}

	public boolean isConfidencial() {
		return confidencial;
	}

	public void setConfidencial(boolean confidencial) {
		this.confidencial = confidencial;
	}

	public int getUltimaLinha() {
		return ultimaLinha;
	}

	public void setUltimaLinha(int ultimaLinha) {
		this.ultimaLinha = ultimaLinha;
	}

	public int getUltimaColuna() {
		return ultimaColuna;
	}

	public void setUltimaColuna(int ultimaColuna) {
		this.ultimaColuna = ultimaColuna;
	}
	
}
