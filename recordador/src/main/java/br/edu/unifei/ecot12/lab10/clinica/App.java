package br.edu.unifei.ecot12.lab10.clinica;

public class App {
	public static void main(String args[]) {
		Consulta c = new Consulta();
		
		c.setPaciente("enzo");
		c.setSintomas("dor de cabeca");
		c.setTratamento("descansar");
	
		Historico h = new Historico();
		
		h.setConsulta(c);
		h.getRegistro().push(c.criar());
		
		c.setSintomas("tontura");
		c.setTratamento("tomar cafe");
		
		System.out.println(c.getSintomas() + " " + c.getTratamento());
		
		h.desfazer();
		
		System.out.println(c.getSintomas() + " " + c.getTratamento());
	}
}
