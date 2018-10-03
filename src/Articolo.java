import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

public class Articolo {
	
	public int id;
	public int quantita;
	public String descrizione;
	
	public Articolo()
	{
	}
	
	public Articolo(int id, int quantita, String descrizione)
	{
		this.id= id;
		this.quantita=quantita;
		this.descrizione=descrizione;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getQuantita()
	{
		return quantita;
	}

	public String getDescrizione()
	{
		return descrizione;
	}
	
	private void setId(int id)
	{
		this.id=id;
	}
	
	private void setQuantita(int quantita)
	{
		this.quantita= quantita;
	}
	
	private void setDescrizione(String descrizione) 
	{
		this.descrizione=descrizione;
	}
	
	public void stampaArticolo()
	{
		System.out.println("ID --> "+id+"\n" +"DESCRIZIONE --> "+ descrizione+"\n" +"QUANTITA' --> "+quantita+"\n");
	}
}
