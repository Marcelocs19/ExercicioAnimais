package pucrs.java.maven.cats;

/**
 * 
 * The class GatosApp is pet clinic system starting
 *
 */
public class PetsApp {
	
	public static void main(String[] args) {
		
		System.out.println("Cats!");
		
		PetCatalog pets = new PetCatalog();
		
		pets.add(new Cat("Garfield"));
		pets.add(new Cat("Tom"));
		pets.add(new Cat("TopCat"));
		
		pets.add(new Dog("Beethoven"));
		pets.add(new Dog("Marley"));
		pets.add(new Dog("Bub"));
		
		pets.doTalk();
	}
	
}
