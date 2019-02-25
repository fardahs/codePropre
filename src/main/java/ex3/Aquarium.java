package ex3;

import java.util.List;

public class Aquarium {

	private List<String> typesAnimal;
	private List<String> nomsAnimal;
	private List<String> comportements;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		typesAnimal.add(typeAnimal);
		nomsAnimal.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: nomsAnimal){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return nomsAnimal.size() * 0.2;
	}


	
	
}
