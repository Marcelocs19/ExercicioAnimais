package pucrs.java.maven.cats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import pucrs.java.maven.cats.Pet.Gender;

public class CatTest {
	
	@Test
	public void testCatCatalogIsAvailable() {
		PetCatalog cats = new PetCatalog();
		assertNotNull(cats);		
	}

	@Test
	public void testCatHasAName() {
		Cat garfield = new Cat("Garfield", Pet.Gender.MALE);
		garfield.meow();
		assertEquals("Garfield",garfield.getName());		
	}

}
