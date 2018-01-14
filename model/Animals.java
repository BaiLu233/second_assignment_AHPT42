package model;
public class Animals extends Kind{
	
	private AnimalNeed animalNeed;
	
	public Animals(String speciesName, AnimalNeed animalNeed)
	{
		super(speciesName);
		this.animalNeed = animalNeed;
	}
	public AnimalNeed getAnimalNeed()
	{
		return animalNeed;
	}

}

