package br.edu.unifei.ecot12.prototipo;

public class Jogo extends Midia {
	
	private String fabricante;
	private String console;
	
	@Override
	public Midia clone() {
		Jogo j = new Jogo();
		
		j.setTitulo(this.getTitulo());
		j.fabricante = this.fabricante;
		j.console = this.console;
		
		return j;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
}
