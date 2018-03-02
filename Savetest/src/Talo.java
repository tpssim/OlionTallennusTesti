import java.util.ArrayList;

public class Talo {

	private int pintaAla;
	private ArrayList<Henkilo> asukkaat;
	
	public Talo(int pintaAla, ArrayList<Henkilo> asukkaat) {
		this.pintaAla = pintaAla;
		this.asukkaat = new ArrayList<>();
		for(Henkilo h : asukkaat) {
			this.asukkaat.add(h);
		}
	}
	
	public void tulostaTiedot() {
		System.out.println("Pinta-ala: " + pintaAla);
		String asuk = "Asukkaat: ";
		for(Henkilo h : asukkaat) {
			asuk += h.annaNimi() + ", " + h.annaIka() + "  ";
		}
		System.out.println(asuk);
	}
	
}
