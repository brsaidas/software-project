package br.edu.unifei.ecot12.fabricaAbstrata;

public class JoalheiroBijuteria implements Joalheiro {
		
	public Colar novoColar() {
		// TODO Auto-generated method stub
		return new ColarBijuteria();
	}

	public Anel novoAnel() {
		// TODO Auto-generated method stub
		return new AnelBijuteria();
	}
	
}
