package pucrs.java.maven.pets.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import pucrs.java.maven.pets.model.Dog;

public class DogTest {

	@Test
	public void testCatCatalogIsAvailable() {
		Dog beethoven = new Dog("Beethoven");
		assertNotNull("Beethoven", beethoven.getName());		
	}

	@Test
	public void testCatHasABark() {
		Dog beethoven = new Dog("Beethoven");
		assertEquals("Beethoven Whoof!",beethoven.bark());		
	}
	
}
