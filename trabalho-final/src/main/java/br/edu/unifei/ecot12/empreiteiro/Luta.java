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

	public void atacar() {
		int atq1, atq2, def1, def2;
		
		if (ser1 instanceof Deus) {
			if (ser1 instanceof Zeus) {
				atq1 = ((Zeus) ser1).getRaio();
			} else if (ser1 instanceof Atenas) {
				atq1 = ((Atenas) ser1).getSabedoria();
			} else if (ser1 instanceof Hades) {
				atq1 = ((Hades) ser1).getMorte();
			} else {
				atq1 = ((Poseidon) ser1).getMar();
			}
			
			def1 = 0;
		} else {
			atq1 = ((Cavaleiro) ser1).getArmadura().getAtaque() + + ((Cavaleiro) ser1).getArmadura().getPoder();
			def1 = ((Cavaleiro) ser1).getArmadura().getDefesa();
		}
		
		if (ser2 instanceof Deus) {
			if (ser2 instanceof Zeus) {
				atq2 = ((Zeus) ser2).getRaio();
			} else if (ser2 instanceof Atenas) {
				atq2 = ((Atenas) ser2).getSabedoria();
			} else if (ser2 instanceof Hades) {
				atq2 = ((Hades) ser2).getMorte();
			} else {
				atq2 = ((Poseidon) ser2).getMar();
			}
			
			def2 = 0;
		} else {
			atq2 = ((Cavaleiro) ser2).getArmadura().getAtaque() + ((Cavaleiro) ser2).getArmadura().getPoder();
			def2 = ((Cavaleiro) ser2).getArmadura().getDefesa();
		}
		
		ser1.setVida(ser1.getVida() - (atq2 - def1));
		ser2.setVida(ser2.getVida() - (atq1 - def2));
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
