package br.edu.unifei.ecot12.decoracao;

public class App {

	public static void main(String args[]) {
		Massa m = new Massa();
		m.setSabor("morango");
		m.setCusto(5.0f);
		System.out.println("massa = " + m.preco());
		Mix x = new Mix(m);
		x.setCombinacao("geleia morango");
		x.setCusto(2.0f);
		System.out.println("mix = " + x.preco());
		MilkShake s = new MilkShake(x);
		s.setLeite(100);
		s.setCusto(1.0f);
		System.out.println("milk + mix = " + s.preco());
	}
	
}
