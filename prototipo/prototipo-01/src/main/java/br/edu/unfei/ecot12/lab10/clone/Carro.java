package br.edu.unfei.ecot12.lab10.clone;

public class Carro implements Prototipo<Carro>, Igualdade<Carro> {
	private String marca;
	private String modelo;
	private String placa;
	private int potencia;
	
	@Override
	public boolean isEqual(Carro obj) {
		return this.marca.equals(obj.marca) && 
				this.modelo.equals(obj.modelo) && 
				this.placa.equals(obj.placa) && 
				this.potencia == obj.potencia;
	}
	
	public Carro clone() {
		Carro obj = new Carro();
		obj.marca = this.marca;
		obj.modelo = this.modelo;
		obj.placa = this.placa;
		obj.potencia = this.potencia;
		return obj;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
