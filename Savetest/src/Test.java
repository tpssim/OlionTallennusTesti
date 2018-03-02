import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] asrgs) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ArrayList<Henkilo> asukkaat = new ArrayList<>();
		asukkaat.add(new Henkilo("Matti", 50));
		asukkaat.add(new Henkilo("Teppo", 53));
		
		Talo T1 = new Talo(62, asukkaat);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Save.txt"));
		out.writeObject(T1);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Save.txt"));
		Talo T2 = (Talo) in.readObject();
		in.close();
		
		T2.tulostaTiedot();
	}
}
