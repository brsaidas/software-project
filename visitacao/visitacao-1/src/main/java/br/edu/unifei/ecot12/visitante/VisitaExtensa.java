package br.edu.unifei.ecot12.visitante;

public class VisitaExtensa implements Visitacao {

	public boolean visitar(Texto t) {
		// TODO Auto-generated method stub
		if (t.getConteudo().length() > 1000) {
			t.resumo280();
			return true;
		} else {
			return false;
		}
	}
		
	public boolean visitar(Panilha p) {
		// TODO Auto-generated method stub
		int t = p.getUltimaLinha() * p.getUltimaColuna(); 
		if (t < 100) {
			p.ultimaPagina();
			return true;
		} else {
			return false;
		}
	}

	public boolean visitar(Desenho d) {
		// TODO Auto-generated method stub
		int t = d.getLinhas() * d.getColunas();
		if (t > 1000) {
			d.apresentar();
			return true;
		} else {
			return false;
		}
	}

}
