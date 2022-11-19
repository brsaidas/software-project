package br.edu.unifei.ecot12.empreiteiro;

public class Ouro implements Producao {
	
	public void contruirArmadura(Cavaleiro c) {
		Armadura a = new Armadura();
		a.setAtaque(400);
		a.setDefesa(700);
		a.setPoder(250);
		c.setArmadura(a);
	}

}
