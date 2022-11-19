package br.edu.unifei.ecot12.empreiteiro;

public class Divino implements Producao {

	public void contruirArmadura(Cavaleiro c) {
		Armadura a = new Armadura();
		a.setAtaque(800);
		a.setDefesa(900);
		a.setPoder(300);
		c.setArmadura(a);
	}
	
}
