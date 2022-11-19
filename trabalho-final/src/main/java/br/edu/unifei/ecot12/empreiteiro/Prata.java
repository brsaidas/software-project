package br.edu.unifei.ecot12.empreiteiro;

public class Prata implements Producao {

	public void contruirArmadura(Cavaleiro c) {
		Armadura a = new Armadura();
		a.setAtaque(200);
		a.setDefesa(600);
		a.setPoder(200);
		c.setArmadura(a);
	}

}
