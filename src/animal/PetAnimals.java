package animal;


public abstract class PetAnimals {

	protected String name;
	protected int age;
	protected String medCondition;
	
	
	
	public PetAnimals(String name, int age, String medCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medCondition = medCondition;
	}
}