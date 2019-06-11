package pucrs.java.maven.pets;

import java.util.ArrayList;
import java.util.List;

public class PetCatalog {
	
	private List<Pet> pets = new ArrayList<Pet>();
	
	
	public void add(Pet pet) {
		pets.add(pet);
	}

	
	public void doTalk() {
		for(Pet pet: pets) {
			System.out.println(pet.talk());
		}
	}	

	
}
