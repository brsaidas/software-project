package br.edu.unifei.ecot12.visitante;

public class VisitaSigilosa implements Visitacao {

	public boolean visitar(Texto t) {
		// TODO Auto-generated method stub
		if (t.isSigilo()) {
			t.imprimirTudo();
			return true;
		} else {
			return false;
		}
	}

	public boolean visitar(Panilha p) {
		// TODO Auto-generated method stub
		if (p.isConfidencial()) {
			p.multiplasPaginas();
			return true;
		} else {
			return false;
		}
	}

	public boolean visitar(Desenho d) {
		// TODO Auto-generated method stub
		if (!d.isPublico()) {
			d.apresentar();;
			return true;
		} else {
			return false;
		}
	}

}
