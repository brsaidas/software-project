package br.edu.unifei.ecot12.prototipo;

public class Video extends Midia {

	private String produtora;
	private String diretor;
	
	@Override
	public Midia clone() {
		Video v = new Video();
		
		v.setTitulo(this.getTitulo());
		v.produtora = this.produtora;
		v.diretor = this.diretor;
		
		return v;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

}
