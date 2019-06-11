package pucrs.java.maven.pets.model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import pucrs.java.maven.pets.Pet;

public class FishTest {
	
	private Fish dori;
	
	@Before
	public void setup() {
		dori = new Fish("Dori",Pet.Gender.FEMALE); 
	}
	
	@Test
	public void testFishHasAName() {		
		assertEquals("Dori",dori.getName());
	}

	@Test
	public void testFishHasAGlub() {
		assertEquals("Dori Gluub!",dori.glub());
	}


}
