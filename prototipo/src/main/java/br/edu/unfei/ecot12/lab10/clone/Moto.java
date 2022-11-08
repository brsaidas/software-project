package br.edu.unfei.ecot12.lab10.clone;

public class Moto implements Prototipo<Moto>, Igualdade<Moto> {
	private String marca;
	private float cilindrada;
	
	@Override
	public boolean isEqual(Moto obj) {
		return this.marca.equals(obj.marca) && this.cilindrada == obj.cilindrada;
	}
	
	@Override
	public Moto clone() {
		Moto obj = new Moto();
		obj.marca = this.marca;
		obj.cilindrada = this.cilindrada;
		return obj;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
}
