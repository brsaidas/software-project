package br.edu.unifei.ecot12.app;

import br.edu.unifei.ecot12.empreiteiro.Bronze;
import br.edu.unifei.ecot12.empreiteiro.Cavaleiro;
import br.edu.unifei.ecot12.empreiteiro.Divino;
import br.edu.unifei.ecot12.empreiteiro.FabricaCavaleiros;
import br.edu.unifei.ecot12.empreiteiro.Luta;
import br.edu.unifei.ecot12.empreiteiro.Ouro;
import br.edu.unifei.ecot12.empreiteiro.Prata;
import br.edu.unifei.ecot12.empreiteiro.Producao;
import br.edu.unifei.ecot12.metodoFabrica.Atenas;
import br.edu.unifei.ecot12.metodoFabrica.Hades;
import br.edu.unifei.ecot12.metodoFabrica.MontarAtenas;
import br.edu.unifei.ecot12.metodoFabrica.MontarHades;
import br.edu.unifei.ecot12.metodoFabrica.MontarPoseidon;
import br.edu.unifei.ecot12.metodoFabrica.MontarZeus;
import br.edu.unifei.ecot12.metodoFabrica.Poseidon;
import br.edu.unifei.ecot12.metodoFabrica.Zeus;

public class App {
	
	public static void main(String args[]) {
		MontarZeus mz = new MontarZeus(); 
		MontarAtenas ma = new MontarAtenas();
		MontarHades mh = new MontarHades();
		MontarPoseidon mp = new MontarPoseidon();
		
		Zeus z = mz.fabricaDeus();
		Atenas a = ma.fabricaDeus();
		Hades h = mh.fabricaDeus();
		Poseidon p = mp.fabricaDeus();
	
		FabricaCavaleiros fc = new FabricaCavaleiros();
		
		Producao br = new Bronze();
		Producao pr = new Prata();
		Producao ou = new Ouro();
		Producao di = new Divino();
		
		fc.setProducao(br);
		Cavaleiro c1 = fc.construir();
		
		fc.setProducao(pr);
		Cavaleiro c2 = fc.construir();
		
		fc.setProducao(ou);
		Cavaleiro c3 = fc.construir();
		
		fc.setProducao(di);
		Cavaleiro c4 = fc.construir();
		
		Luta l = new Luta();
		l.setData("Hoje");
		l.setLocal("UNIFEI");
		l.setMotido("Jogo do Brasil");
		l.setSer1(z);
		l.setSer2(c4);
		
		l.atacar();
		
		System.out.println("Z: " + z.getVida());
		System.out.println("C4: " + c4.getVida());
	}
	
}
