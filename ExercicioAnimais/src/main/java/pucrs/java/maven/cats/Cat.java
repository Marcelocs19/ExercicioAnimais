package pucrs.java.maven.cats;

public class Cat extends Pet {
	
	public Cat(String name, Pet.Gender sex) {
		super(name, sex);		
	}
	
	
	public String meow() {
		return getName() + " " +"Meow!";
	}


	@Override
	public String talk() {
		return meow();
	}
			
	
}
