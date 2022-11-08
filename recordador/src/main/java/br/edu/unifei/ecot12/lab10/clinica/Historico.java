package br.edu.unifei.ecot12.lab10.clinica;

import java.util.Stack;

public class Historico {
	private Consulta consulta;
	private Stack<Registro> registro = new Stack<Registro>();
	
	public boolean desfazer() {
		if (!registro.isEmpty()) {
			consulta.restaurar(registro.pop());
			return true;
		} else {
			return false;
		}
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Stack<Registro> getRegistro() {
		return registro;
	}

	public void setRegistro(Stack<Registro> registro) {
		this.registro = registro;
	}	
}
