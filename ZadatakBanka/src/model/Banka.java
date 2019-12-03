package model;

import java.util.ArrayList;
import java.util.List;

public class Banka {
	
	private List<Ugovor> listaUgovora = new ArrayList<Ugovor>();
	private String imeBanke;
	private double ukupnaVrednostUgovora;
	
	public Banka(List<Ugovor> listaUgovora, String imeBanke) {
		super();
		this.listaUgovora = listaUgovora;
		this.imeBanke = imeBanke;
		
		double zbir = 0;
		
		for(Ugovor u: listaUgovora) {
			zbir += u.getVrednostUgovora();
		}
		
		this.ukupnaVrednostUgovora = zbir;
		
	}

	public List<Ugovor> getListaUgovora() {
		return listaUgovora;
	}

	public void setListaUgovora(List<Ugovor> listaUgovora) {
		this.listaUgovora = listaUgovora;
	}

	public String getImeBanke() {
		return imeBanke;
	}

	public void setImeBanke(String imeBanke) {
		this.imeBanke = imeBanke;
	}

	public double getUkupnaVrednostUgovora() {
		return ukupnaVrednostUgovora;
	}

	public void setUkupnaVrednostUgovora(double ukupnaVrednostUgovora) {
		this.ukupnaVrednostUgovora = ukupnaVrednostUgovora;
	}

	@Override
	public String toString() {
		return "Banka [listaUgovora=" + listaUgovora + ", imeBanke=" + imeBanke + ", ukupnaVrednostUgovora="
				+ ukupnaVrednostUgovora + "]";
	}
	
	
	public void najvrednijiUgovor() {
		
		double max = 0;
		
		for(Ugovor u: listaUgovora) {
			
			if(u.getVrednostUgovora()>max) {
				max = u.getVrednostUgovora();
			}
		}
		
		System.out.println("Najvredniji ugovor je: " + max);
	}
	
	public double prosecnoTrajanjeUgovora() {
		
		int ukupnoUgovora = listaUgovora.size();
		int zbir = 0;
		for(Ugovor u: listaUgovora) {
			zbir += u.getTrajanjeUgovora();
		}
		
		return (double)zbir/ukupnoUgovora;
		
	}
	
	
	
	
	
	
	
	
	

}
