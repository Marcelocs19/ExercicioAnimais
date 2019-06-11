package pucrs.java.maven.cats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CatCatalogTest {

	@Test
	public void testCatCatalogIsAvailable() {
		CatCatalog cats = new CatCatalog();
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
		CatCatalog cats = new CatCatalog();
		Cat garfield = new Cat("Garfield");
		cats.add(garfield);
	}

}
