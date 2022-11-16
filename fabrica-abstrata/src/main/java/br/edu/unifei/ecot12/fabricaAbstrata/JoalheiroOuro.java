package br.edu.unifei.ecot12.fabricaAbstrata;

public class JoalheiroOuro implements Joalheiro {

	public Colar novoColar() {
		// TODO Auto-generated method stub
		return new ColarOuro();
	}

	public Anel novoAnel() {
		// TODO Auto-generated method stub
		return new AnelOuro();
	}

}
