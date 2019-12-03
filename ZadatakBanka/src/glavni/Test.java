package glavni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Banka;
import model.Osoba;
import model.Ugovor;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Unesite ime: ");
		 * 
		 * String imeSaSkenera = s.nextLine();
		 */
		
		Osoba o = new Osoba();
			o.setIme("Pera");
			o.setPrezime("Peric");
			o.setJmbg("123456789012387878");
			o.setAdresa("Knez Mihajlova 6");
			o.setBrojGodina(19);
		
		Osoba x = new Osoba("Mitar", "Miric", "9876543210987", "a", 15);
		
		System.out.println(o.toString());
		System.out.println(o.validacijaJMBG());
		
		Ugovor ugovor1 = new Ugovor(o, x, 7000, 7);
		Ugovor ugovor2 = new Ugovor(o, x, 15000, 8);
		Ugovor ugovor3 = new Ugovor(o, x, 30000, 6);
		Ugovor ugovor4 = new Ugovor(o, x, 4000, 5);
		
		
		List<Ugovor> listaUgovora = new ArrayList<Ugovor>();
			listaUgovora.add(ugovor1);
			listaUgovora.add(ugovor2);
			listaUgovora.add(ugovor3);
			listaUgovora.add(ugovor4);
		
		Banka banka = new Banka(listaUgovora,"Intesa");
		
		System.out.println(banka.getUkupnaVrednostUgovora());
		banka.najvrednijiUgovor();
		System.out.println(banka.prosecnoTrajanjeUgovora());
		

	}

}
