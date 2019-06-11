package pucrs.java.maven.cats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class PetsCatalogTest {

	@Test
	public void testCatCatalogIsAvailable() {
		PetCatalog cats = new PetCatalog();
		assertNotNull(cats);		
	}

	@Test
	public void testCatHasAName() {
		Cat garfield = new Cat("Garfield");
		garfield.meow();
		assertEquals("Garfield",garfield.getName());		
	}
	
	@Test
	public void testCatHasAMeow() {
		Cat garfield = new Cat("Garfield");
		assertEquals("Garfield Meow!",garfield.meow());		
	}
	
	@Test
	public void testAddGarfieldIntoCatCatalog() {
		PetCatalog cats = new PetCatalog();
		Cat garfield = new Cat("Garfield");
		cats.add(garfield);
	}

}
