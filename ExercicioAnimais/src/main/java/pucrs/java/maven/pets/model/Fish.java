package pucrs.java.maven.pets.model;

import pucrs.java.maven.pets.Pet;

public class Fish extends Pet{

	
	
	public Fish(String name, Gender sex) {
		super(name, sex);
	}

	public String glub() {
		return getName() + " " +"Gluub!";
	}
	
	@Override
	public String talk() {
		return glub();
	}

}
