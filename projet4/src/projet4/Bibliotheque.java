package projet4;
import java.util.ArrayList;
import java.util.List;
public class Bibliotheque {
	
	private ArrayList<Livre> Les_livres;
	
	
	public Bibliotheque() {
		Les_livres = new ArrayList<>();
       
    }

	public void ajouterLivre(Livre livre) {
		Les_livres.add(livre);
		
	}
	public void afficherLivre() {
		System.out.println("les informations des livres présents dans la bibliotheque:");
		for(Livre livre : Les_livres) {
			livre.afficherDetails();
		}
	}
	

	
}