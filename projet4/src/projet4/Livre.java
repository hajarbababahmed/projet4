package projet4;

public class Livre {
	protected String titre;
	protected String auteur;
	protected int anneePublication;
	
	
	
	public Livre(String titre,String auteur,int anneePublication) {
		this.titre= titre;
		this.auteur= auteur;
		this.anneePublication= anneePublication;
	}
	
	
	public void afficherDetails(String titre,String auteur,int anneePublication) {
		System.out.println("le titre est:"+titre+"et l'auteur est:"+auteur+"et l'annee de publication est:"+anneePublication);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre1=new Livre("antigone","Anouilh",1944);
		System.out.println("informations de livre:"+livre1);
		livre1.afficherDetails("antigone","Anouilh",1944);

	}

}