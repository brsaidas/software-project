package br.edu.unifei.ecot12.visitante;

public class Desenho extends Documento {
	
	private boolean publico;
	private int paletaCores;
	private int linhas;
	private int colunas;

	public void apresentar() {
		System.out.println("Resolução Normal");
	}
	
	public void apresentarFullHd() {
		System.out.println("Resolução Full Hd");
	}
	
	public void apresentar4k() {
		System.out.println("Resolução 4K");
	}
	
	@Override
	public boolean aceitar(Visitacao v) {
		// TODO Auto-generated method stub
		return v.visitar(this);
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public int getPaletaCores() {
		return paletaCores;
	}

	public void setPaletaCores(int paletaCores) {
		this.paletaCores = paletaCores;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
}
