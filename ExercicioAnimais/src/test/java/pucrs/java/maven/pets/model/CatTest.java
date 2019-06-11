package pucrs.java.maven.pets.model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import pucrs.java.maven.pets.Pet;
import pucrs.java.maven.pets.model.Cat;

public class CatTest {
	
	Pet garfield;
	
	@Before
	public void setup() {
		garfield = new Cat("Garfield", Pet.Gender.MALE);
	}
	
	@Test
	public void testCatHasAName() {
		assertEquals("Garfield Meow!",garfield.talk());		
	}
	
	@Test
	public void testCatSex() {
		assertEquals(Pet.Gender.MALE,garfield.getSex());	
	}


}
