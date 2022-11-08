package br.edu.unifei.ecot12.lab10.clinica;

import java.util.Calendar;

public class Consulta {
	private Calendar data;
	private String paciente;
	private String sintomas;
	private String tratamento;
	
	public Registro criar() {
		return new Registro(sintomas, tratamento);
	}
	
	public void restaurar(Registro r) {
		this.sintomas = r.getSintomas();
		this.tratamento = r.getTratamento();
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
}
