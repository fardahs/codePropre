package ex1;

import java.util.Date;

public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date date_Creation;
	
	public static final int CAPITAL_MAX = 3_000_000;
	
	public Entreprise(int siret, String nom, String adresse, Date date_creation){
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.date_Creation = date_creation;
	}
	
	public void Afficher_statut(){
		System.out.println("Status");
		System.out.println("Siret : " + getSiret() + " Nom : " + getNom() + " Date de création " 
								+ getDate_Creation() +" adresse :" + getAdresse());
	}

	/**
	 * Getter for siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Getter for name
	 * @return the name
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Getter for adresse
	 * @return the adresse
	 */

	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * Getter for date of creation
	 * @return the date of creation
	 */

	public Date getDate_Creation() {
		return date_Creation;
	}
	
	/**
	 * Setter for the name
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * setter for the adresse
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
