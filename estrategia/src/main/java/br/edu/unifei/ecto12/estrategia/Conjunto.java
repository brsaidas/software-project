package br.edu.unifei.ecto12.estrategia;

public class Conjunto {

	private double elementos[];
	private Estatistica estatistica;
	
	public double analisar() {
		if (estatistica != null) {
			return estatistica.calcular(elementos);
		} else {		
			return 0;
		}
	}

	public double[] getElementos() {
		return elementos;
	}

	public void setElementos(double[] elementos) {
		this.elementos = elementos;
	}

	public Estatistica getEstatistica() {
		return estatistica;
	}

	public void setEstatistica(Estatistica estatistica) {
		this.estatistica = estatistica;
	}
	
}
