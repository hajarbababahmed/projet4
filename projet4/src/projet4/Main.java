import projet4.Bibliotheque;
import projet4.Livre;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotheque bibliotheque = new Bibliotheque();
        Livre livre1 = new Livre("Antigone", "Anouilh", 1944);
        Livre livre2 = new Livre("Cent ans de solitude", "Gabriel Garcia Marquez", 1967);
        Livre livre3 = new Livre("1984", "George Orwell", 1949);

        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        bibliotheque.ajouterLivre(livre3);

        bibliotheque.afficherLivre();
		

	}

}
