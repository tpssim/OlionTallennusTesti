import java.io.Serializable;

public class Henkilo implements Serializable{
	
	private String nimi;
	private int ika;
	
	public Henkilo(String nimi, int ika) {
		this.nimi = nimi;
		this.ika = ika;
	}
	
	public String annaNimi() {
		return nimi;
	}
	
	public int annaIka() {
		return ika;
	}
	
}
