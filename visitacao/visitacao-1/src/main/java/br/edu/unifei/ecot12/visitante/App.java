package br.edu.unifei.ecot12.visitante;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		List<Documento> l = new ArrayList<Documento>();
		for (int i = 0; i < 100; i++) {
			switch(r.nextInt(3)) {
				case 0:
					Texto t = new Texto();
					t.setSigilo(r.nextBoolean());
					l.add(t);
					break;
				case 1:
					Panilha p = new Panilha();
					p.setConfidencial(r.nextBoolean());
					l.add(p);
				case 2:
					Desenho d = new Desenho();
					d.setPublico(r.nextBoolean());
					l.add(d);
					break;
			}
		}
		int conta = 0;
		VisitaSigilosa v = new VisitaSigilosa();
		for (Documento d : l) {
			if (d.aceitar(v)) {
				conta++;
			}
		}
		System.out.println("total: " + conta);
	}

}
