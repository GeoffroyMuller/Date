package date;

public class Date {

	JourSemaine leJour;
	int numJour;
	Mois leMois;
	int annee;
	
	/**
	 * le constructeur de la classe
	 * @param pLeJour
	 * @param pNumJour
	 * @param pLeMois
	 * @param pAnnee
	 */
	public Date(JourSemaine pLeJour, int pNumJour, Mois pLeMois, int pAnnee) {
		this.leJour = pLeJour;
		this.numJour = pNumJour;
		this.leMois = pLeMois;
		this.annee = pAnnee;
	}
	
	public Date précédente(Date pDate) {
		Date nDate;
		nDate = new Date()
	}
}
