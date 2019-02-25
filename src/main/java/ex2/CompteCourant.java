package ex2;

public class CompteCourant extends CompteBancaire{

	public CompteCourant(double solde) {
		super(solde);
	}


	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	

	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > decouvert){
			this.solde = solde - montant;
		}
		
	}


	public double getDecouvert() {
		return decouvert;
	}


	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
}
