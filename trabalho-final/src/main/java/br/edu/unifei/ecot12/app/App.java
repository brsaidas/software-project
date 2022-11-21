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
		//Instanciando as Fabricas
		MontarZeus mz = new MontarZeus(); 
		MontarAtenas ma = new MontarAtenas();
		MontarHades mh = new MontarHades();
		MontarPoseidon mp = new MontarPoseidon();
		
		//Fabricando os Deuses
		Zeus z = mz.fabricaDeus();
		Atenas a = ma.fabricaDeus();
		Hades h = mh.fabricaDeus();
		Poseidon p = mp.fabricaDeus();
	
		//Empreiteiro dos Cavaleiros
		FabricaCavaleiros fc = new FabricaCavaleiros();
		
		//Fabricando as Armaduras
		Producao br = new Bronze();
		Producao pr = new Prata();
		Producao ou = new Ouro();
		Producao di = new Divino();
		
		//Criando os Cavaleiros
		fc.setProducao(br);
		Cavaleiro c1 = fc.construir();
		
		fc.setProducao(pr);
		Cavaleiro c2 = fc.construir();
		
		fc.setProducao(ou);
		Cavaleiro c3 = fc.construir();
		
		fc.setProducao(di);
		Cavaleiro c4 = fc.construir();
		
		System.out.println("------------------------------");
		
		//Zeus x Cavaleiro de Bronze		
		Luta l1 = new Luta();
		l1.setData("Hoje");
		l1.setLocal("UNIFEI");
		l1.setMotivo("Jogo do Brasil");
		l1.setSer1(z);
		l1.setSer2(c1);
		
		l1.atacar();
		
		System.out.println("Data: " + l1.getData());
		System.out.println("Local: " + l1.getLocal());
		System.out.println("Motivo: " + l1.getMotivo());
		System.out.println("Vida Zeus: " + z.getVida());
		System.out.println("Vida Bronze: " + c1.getVida());
		System.out.println("------------------------------");
		
		//Atenas x Cavaleiro de Prata
		Luta l2 = new Luta();
		l2.setData("Amanha");
		l2.setLocal("IEST");
		l2.setMotivo("FIFA 2022 no Catar proibe cerveja");
		l2.setSer1(a);
		l2.setSer2(c2);
		
		l2.atacar();
		
		System.out.println("Data: " + l2.getData());
		System.out.println("Local: " + l2.getLocal());
		System.out.println("Motivo: " + l2.getMotivo());
		System.out.println("Vida Atenas: " + a.getVida());
		System.out.println("Vida Prata: " + c2.getVida());
		System.out.println("------------------------------");
		
		//Hades x Cavaleiro de Ouro
		Luta l3 = new Luta();
		l3.setData("Ontem");
		l3.setLocal("IMC");
		l3.setMotivo("Artemes 1 chegando a lua");
		l3.setSer1(h);
		l3.setSer2(c3);
		
		l3.atacar();
		
		System.out.println("Data: " + l3.getData());
		System.out.println("Local: " + l3.getLocal());
		System.out.println("Motivo: " + l3.getMotivo());
		System.out.println("Vida Hades: " + h.getVida());
		System.out.println("Vida Ouro: " + c3.getVida());
		System.out.println("------------------------------");
		
		//Poseidon x Cavaleiro de Divino
		Luta l4 = new Luta();
		l4.setData("Agora");
		l4.setLocal("PRG");
		l4.setMotivo("Aulas acabando no Natal");
		l4.setSer1(p);
		l4.setSer2(c4);
		
		l4.atacar();
		
		System.out.println("Data: " + l4.getData());
		System.out.println("Local: " + l4.getLocal());
		System.out.println("Motivo: " + l4.getMotivo());
		System.out.println("Vida Poseidon: " + p.getVida());
		System.out.println("Vida Divino: " + c4.getVida());
		System.out.println("------------------------------");
	}
	
}
