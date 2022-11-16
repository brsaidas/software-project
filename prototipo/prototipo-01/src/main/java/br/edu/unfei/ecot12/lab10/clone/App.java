package br.edu.unfei.ecot12.lab10.clone;

public class App {
	public static void main(String args[]) {
		Carro c1 = new Carro();
		
		c1.setMarca("gm");
		c1.setModelo("astra");
		c1.setPlaca("abc1234");
		c1.setPotencia(2);
		
		Carro c2 = c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
		System.out.println(c1.isEqual(c2));
	}
}
