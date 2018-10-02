import java.util.Collection;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Magazzino {
	
	HashMap<Integer, Articolo> magazzino = new HashMap<Integer, Articolo>(0);
	
	
	public Magazzino() {
		// TODO Auto-generated constructor stub
	}
	
	public void addArticolo(Articolo articolo)
	{
		magazzino.put(articolo.id, articolo);
	}
	
	public void stampaMagazzino()
	{
		Collection<Articolo> collection = magazzino.values();
		Iterator it = (Iterator) ((HashMap<Integer,Articolo>) collection).entrySet().iterator();
		while (it.hasNext()){
		 Articolo art = it.next();
		  System.out.println(art);
		}
	}

}		 Iterator it = mp.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry pair = (Map.Entry)it.next();
    System.out.println(pair.getKey() + " = " + pair.getValue());
    it.remove(); // avoids a ConcurrentModificationException
}
