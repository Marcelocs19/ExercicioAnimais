package pucrs.java.maven.cats;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

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
