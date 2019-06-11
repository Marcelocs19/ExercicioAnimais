package pucrs.java.maven.cats;

public class Dog {
	
	private String name;
	
	

	public Dog(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	
	public String bark() {
		return name + " " +"Whoof!";
	}
		
	

}
