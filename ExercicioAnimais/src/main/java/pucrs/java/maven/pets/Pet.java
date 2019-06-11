package pucrs.java.maven.pets;

public abstract class Pet {

	private String name;
	private Gender sex;
	
	public enum Gender {MALE,FEMALE};
	
	public Pet(String name, Gender sex) {
		super();
		this.name = name;
		this.sex = sex;
	}	
	
	public Gender getSex() {
		return sex;
	}

	public abstract String talk();
	
	
	public String getName() {
		return name;
	}

}