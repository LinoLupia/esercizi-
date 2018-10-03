import java.util.Collection;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Magazzino {
	
	HashMap<Integer, Articolo> magazzino = new HashMap<Integer, Articolo>(0);
	
	
	public Magazzino() {
		// TODO Auto-generated constructor stub
	}
	
	public void addArticolo(Articolo articolo)
	{
		magazzino.put(articolo.id, articolo);
	}
	
	public void controlloQuantita()
	{
		System.out.println("CONTROLLO QUANTITA'");
		int valoreControllo = 3;
		Articolo value= new Articolo();
	 	    for (Integer key : magazzino.keySet()) 
	 	    {	
	 	    	value = magazzino.get(key);
	 	    	if(value.getQuantita() < valoreControllo)
	 	     		System.out.println("ARTICOLO " + key + " IN EUSARIMENTO, QUANTITA' = " + value.getQuantita());
	 	    }
	}
	
	public void controlloQuantitaProdotto()
	{
		System.out.println("CONTROLLO QUANTITA' PRODOTTO");
		int valoreControllo = 3;
		System.out.println("iolla");
		Scanner input = new Scanner(System.in);
		String descrizione = input.nextLine();
		Articolo value= new Articolo();
	 	    for (Integer key : magazzino.keySet()) 
	 	    {	
	 	    	value = magazzino.get(key);
	 	    	if(descrizione.equals(value.getDescrizione()) && value.getQuantita() < valoreControllo)
	 	     		System.out.println("ARTICOLO " + key + " IN EUSARIMENTO, QUANTITA' = " + value.getQuantita());
	 	    }
	}
	
	public void stampaMagazzino()
	{
	 Iterator iterator = magazzino.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + ((Articolo) me2.getValue()).getDescrizione());
        } 
	}
	
}	

