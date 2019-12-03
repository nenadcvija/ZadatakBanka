package model;

public class Ugovor {
	
	private Osoba fizickoLice;
	private Osoba sluzbenik;
	private double vrednostUgovora;
	private int trajanjeUgovora;
	private boolean luksuzan;
	
	public Ugovor(Osoba fizickoLice, Osoba sluzbenik, double vrednostUgovora, int trajanjeUgovora) {
		super();
		this.fizickoLice = fizickoLice;
		this.sluzbenik = sluzbenik;
		this.vrednostUgovora = vrednostUgovora;
		this.trajanjeUgovora = trajanjeUgovora;
	
		if(vrednostUgovora > 10000) {
			luksuzan = true;
		}else {
			luksuzan = false;
		}
	}

	public Osoba getFizickoLice() {
		return fizickoLice;
	}

	public void setFizickoLice(Osoba fizickoLice) {
		this.fizickoLice = fizickoLice;
	}

	public Osoba getSluzbenik() {
		return sluzbenik;
	}

	public void setSluzbenik(Osoba sluzbenik) {
		this.sluzbenik = sluzbenik;
	}

	public double getVrednostUgovora() {
		return vrednostUgovora;
	}

	public void setVrednostUgovora(double vrednostUgovora) {
		this.vrednostUgovora = vrednostUgovora;
	}

	public int getTrajanjeUgovora() {
		return trajanjeUgovora;
	}

	public void setTrajanjeUgovora(int trajanjeUgovora) {
		this.trajanjeUgovora = trajanjeUgovora;
	}

	public boolean isLuksuzan() {
		return luksuzan;
	}

	public void setLuksuzan(boolean luksuzan) {
		this.luksuzan = luksuzan;
	}

	@Override
	public String toString() {
		return "Ugovor [fizickoLice=" + fizickoLice + ", sluzbenik=" + sluzbenik + ", vrednostUgovora="
				+ vrednostUgovora + ", trajanjeUgovora=" + trajanjeUgovora + ", luksuzan=" + luksuzan + "]";
	}
	
	
	
	
	
	

}
