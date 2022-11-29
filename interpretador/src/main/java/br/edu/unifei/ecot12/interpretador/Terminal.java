package br.edu.unifei.ecot12.interpretador;

public class Terminal implements Expressao {

	private String info;
	
	public Terminal(String info) {
		this.info = info;
	}
	
	public boolean interpretar(String s) {
		// TODO Auto-generated method stub
		return info.equals(s);
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
