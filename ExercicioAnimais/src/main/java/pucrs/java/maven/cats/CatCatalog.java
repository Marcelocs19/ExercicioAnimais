package pucrs.java.maven.cats;

import java.util.ArrayList;
import java.util.List;

public class CatCatalog {
	
	private List<Cat> cats = new ArrayList<Cat>();

	public void addCatByName(String string) {
				
	}
	
	public void add(Cat garfield) {
		cats.add(garfield);
	}
	
	public void doMeow() {
		for(Cat cat: cats) {
			System.out.println(cat.meow());
		}
	}
	
}
