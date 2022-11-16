package br.edu.unifei.ecot12.app;

import br.edu.unifei.ecot12.fabricaAbstrata.Anel;
import br.edu.unifei.ecot12.fabricaAbstrata.AnelBijuteria;
import br.edu.unifei.ecot12.fabricaAbstrata.Colar;
import br.edu.unifei.ecot12.fabricaAbstrata.ColarBijuteria;
import br.edu.unifei.ecot12.fabricaAbstrata.JoalheiroBijuteria;

public class App {
	public static void main(String args[]) {
		JoalheiroBijuteria j = new JoalheiroBijuteria();
		
		Anel a1 = j.novoAnel();
		Colar c1 = j.novoColar();
		
		System.out.println("[" + a1 + "]" + "[" + c1 + "]");
		
		AnelBijuteria a2 = (AnelBijuteria) j.novoAnel();
		ColarBijuteria c2 = (ColarBijuteria) j.novoColar();
	
		System.out.println("[" + a2 + "]" + "[" + c2 + "]");
	}
}
