package pucrs.java.maven.cats;

public class Cat extends Pet {
	
	public Cat(String name) {
		super(name);		
	}
	
	
	public String meow() {
		return getName() + " " +"Meow!";
	}


	@Override
	public String talk() {
		return meow();
	}
			
	
}
