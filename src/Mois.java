package date;

public class Mois {

	final static String[] nomsMois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
	String nom;
	int nbJours;
	int numMois;
	
	/**
	 * le constructeur de la classe
	 * @param pNom
	 */
	public Mois(String pNom) {
		this.nom = pNom;
	}
	
	public Mois(String pNom, int pNbJours, int pNumMois) {
		this.nom = pNom;
		this.nbJours = pNbJours;
		this.numMois = pNumMois;
	}
	
	public Mois précédent(Mois pMois) {
		
	}
	
	
}
