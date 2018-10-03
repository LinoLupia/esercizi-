
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articolo art1= new Articolo(1,2,"Scarpa");
		Articolo art2= new Articolo(2,29,"Pantaloni");
		Articolo art3= new Articolo(3,2,"Jeans");
		Articolo art4= new Articolo(4,20,"tshirt");
		Articolo art5= new Articolo(5,2,"Sciarpa");
		
		
		Magazzino magazzino = new Magazzino();
		magazzino.addArticolo(art1);
		magazzino.addArticolo(art2);
		magazzino.addArticolo(art3);
		magazzino.addArticolo(art4);
		magazzino.addArticolo(art5);
		magazzino.stampaMagazzino();
		magazzino.controlloQuantita();
		magazzino.controlloQuantitaProdotto();

	}

}
