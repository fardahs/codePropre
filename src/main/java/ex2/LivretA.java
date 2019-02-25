package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA( double solde) {
		super(solde);
	}

	public void appliquerRemuAnnuelle(){

		this.solde = solde + solde*tauxRemuneration/100;

	}

	@Override
	public void debiterMontant(double montant) {

		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}	
	}
	
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
