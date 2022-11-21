package br.edu.unifei.ecot12.comando;

import java.util.ArrayList;
import java.util.List;

public class Iluminacao {

	private List<Comando> comandos = new ArrayList<Comando>();
	
	public void piscaPisca() {
		for (Comando c : comandos) {
			c.executar();
		}
	}

	public List<Comando> getComandos() {
		return comandos;
	}
	
}
