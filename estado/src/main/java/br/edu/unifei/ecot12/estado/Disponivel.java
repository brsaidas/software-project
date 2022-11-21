package br.edu.unifei.ecot12.estado;

public class Disponivel implements Estado {

	private String estante;
		
	public void inverter(Livro l) {
		l.setEstado(new Emprestado());
	}

	public String getEstante() {
		return estante;
	}

	public void setEstante(String estante) {
		this.estante = estante;
	}

}
