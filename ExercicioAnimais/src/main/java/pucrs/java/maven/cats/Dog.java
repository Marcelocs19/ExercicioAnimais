package pucrs.java.maven.cats;

public class Dog extends Pet {
	

	public Dog(String name) {
		super(name);
	}
	
	
	public String bark() {
		return getName() + " " +"Whoof!";
	}


	@Override
	public String talk() {
		return bark();
	}
		
	

}
