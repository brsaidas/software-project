package br.edu.unifei.ecot12.empreiteiro;

import br.edu.unifei.ecot12.metodoFabrica.Atenas;
import br.edu.unifei.ecot12.metodoFabrica.Deus;
import br.edu.unifei.ecot12.metodoFabrica.Hades;
import br.edu.unifei.ecot12.metodoFabrica.Poseidon;
import br.edu.unifei.ecot12.metodoFabrica.Zeus;

public class Luta {

	private String data;
	private String motivo;
	private String local;
	private Ser ser1, ser2;

	class Par {
		
		int atq, def;

		public int getAtq() {
			return atq;
		}

		public void setAtq(int atq) {
			this.atq = atq;
		}

		public int getDef() {
			return def;
		}

		public void setDef(int def) {
			this.def = def;
		}
		
	}
	
	private void atribuir(Ser ser, Par par) {
		if (ser instanceof Deus) {
			if (ser instanceof Zeus) {
				par.setAtq(((Zeus) ser).getRaio());
			} else if (ser instanceof Atenas) {
				par.setAtq(((Atenas) ser).getSabedoria());
			} else if (ser instanceof Hades) {
				par.setAtq(((Hades) ser).getMorte());
			} else {
				par.setAtq(((Poseidon) ser).getMar());
			}
			
			par.setDef(0);
		} else {
			par.setAtq(((Cavaleiro) ser).getArmadura().getAtaque() + ((Cavaleiro) ser).getArmadura().getPoder());
			par.setDef(((Cavaleiro) ser).getArmadura().getDefesa());
		}
	}
	
	public void atacar() {
		Par parSer1 = new Par(), parSer2 = new Par();
		
		atribuir(ser1, parSer1);
		atribuir(ser2, parSer2);
		
		ser1.setVida(ser1.getVida() - (parSer2.getAtq() - parSer1.getDef()));
		ser2.setVida(ser2.getVida() - (parSer1.getAtq() - parSer2.getDef()));
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Ser getSer1() {
		return ser1;
	}

	public void setSer1(Ser ser1) {
		this.ser1 = ser1;
	}

	public Ser getSer2() {
		return ser2;
	}

	public void setSer2(Ser ser2) {
		this.ser2 = ser2;
	}
	
}
