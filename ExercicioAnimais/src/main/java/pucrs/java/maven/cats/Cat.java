package pucrs.java.maven.cats;

public class Cat {
	
	private String name;
	
	

	public Cat(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	
	public String meow() {
		return name + " " +"Meow!";
	}
		
	
	


}
