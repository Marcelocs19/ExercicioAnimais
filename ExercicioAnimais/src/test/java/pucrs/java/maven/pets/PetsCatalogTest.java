package pucrs.java.maven.pets;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import pucrs.java.maven.pets.Pet;
import pucrs.java.maven.pets.PetCatalog;
import pucrs.java.maven.pets.model.Cat;

public class PetsCatalogTest {

	@Test
	public void testCatCatalogIsAvailable() {
		PetCatalog cats = new PetCatalog();
		assertNotNull(cats);
	}

	@Test
	public void testAddGarfieldIntoCatCatalog() {
		PetCatalog cats = new PetCatalog();
		Cat garfield = new Cat("Garfield", Pet.Gender.MALE);
		cats.add(garfield);
	}

}
