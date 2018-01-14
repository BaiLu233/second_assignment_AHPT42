package model;
public class Flying extends SpeciesNeed{
	private int numberOfWings;
	public Flying(int numberOfWings)
	{
		this.numberOfWings = numberOfWings;
		need = " this flyer has " + Integer.toString(numberOfWings) + " wings ";
	}
	public Flying()
	{

	}
	public int getNumberOfWings()
	{
		return numberOfWings;

	}
	public void setNumberOfWings(int numberOfWings)
	{
        this.numberOfWings = numberOfWings;
        need = " this flyer has " + Integer.toString(numberOfWings) + " wings ";
	}

}
