package br.edu.unifei.ecot12.empreiteiro;

public class Bronze implements Producao {

	public void contruirArmadura(Cavaleiro c) {
		Armadura a = new Armadura();
		a.setAtaque(100);
		a.setDefesa(500);
		a.setPoder(150);
		c.setArmadura(a);
	}
	
}
