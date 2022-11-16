package br.edu.unifei.ecot12.prototipo;

public class Musical extends Midia {
	
	private String autor;
	private String produtora;
	
	@Override
	public Midia clone() {
		Musical m = new Musical();
		
		m.setTitulo(this.getTitulo());
		m.autor = this.autor;
		m.produtora = this.produtora;
		
		return m;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	
}
