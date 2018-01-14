package model;
public class Mammal extends SpeciesNeed{
    private int numberOfPaws;
	public Mammal(int numberOfPaws)
	{
        this.numberOfPaws = numberOfPaws;
        need = " This animal has " + numberOfPaws + " paws ";
	}
	public Mammal()
	{

	}
    public int getPaws()
    {
        return numberOfPaws;
    }
	public void setPaws(int numberOfPaws)
	{
        this.numberOfPaws = numberOfPaws;
        need = " This animal has " + numberOfPaws + " paws ";
	}
}
