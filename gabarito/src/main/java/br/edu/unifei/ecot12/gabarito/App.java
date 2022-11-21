package br.edu.unifei.ecot12.gabarito;

public class App {
	public static void main(String args[]) {
		Componente c1 = new Componente();
		c1.setValorCusto(1.0d);
		c1.setValorVenda(1.5d);
		System.out.println("c1 = " + c1.lucro());
		
		Componente c2 = new Componente();
		c2.setValorCusto(2.0d);
		c2.setValorVenda(3.0d);
		System.out.println("c2 = " + c2.lucro());
		
		Artesanato a = new Artesanato();
		a.getComponentes().add(c1);
		a.getComponentes().add(c2);
		System.out.println("a = " + a.lucro());
	}
}
