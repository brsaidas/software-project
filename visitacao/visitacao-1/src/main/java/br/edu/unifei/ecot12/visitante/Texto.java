package br.edu.unifei.ecot12.visitante;

public class Texto extends Documento {

	private boolean sigilo;
	private String conteudo = "";
		
	public void resumo280() {
		System.out.println(conteudo.substring(0, 279));
	}
	
	public void imprimirTudo() {
		System.out.println(conteudo);
	}
	
	@Override
	public boolean aceitar(Visitacao v) {
		// TODO Auto-generated method stub
		return v.visitar(this);
	}

	public boolean isSigilo() {
		return sigilo;
	}

	public void setSigilo(boolean sigilo) {
		this.sigilo = sigilo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
