package br.edu.unifei.ecot12.interpretador;

public class ExpressaoOr implements Expressao {

	private Expressao esquerda;
	private Expressao direita;
	
	public ExpressaoOr(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public boolean interpretar(String s) {
		// TODO Auto-generated method stub
		String strEsq, strDir;
		int pos = s.indexOf(' ');
		if (pos > 0) {
			strEsq = s.substring(0, pos);
			strDir = s.substring(pos + 1);
		} else {
			strEsq = s;
			strDir = s;
		}
		return esquerda.interpretar(strEsq) || direita.interpretar(strDir);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Expressao esquerda) {
		this.esquerda = esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

	public void setDireita(Expressao direita) {
		this.direita = direita;
	}

}
