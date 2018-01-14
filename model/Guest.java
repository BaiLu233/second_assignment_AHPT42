package model;

public class Guest extends Kind
{
    private String name;
    private String getinway;
    private SpeciesNeed speciesNeed;
	private Song song;
	private Animals animal;
    private boolean nameNotoccor;
	public Guest(boolean nameNotoccor,String name,SpeciesNeed speciesNeed,Animals animal,Song song,String getinway)
	{
        super(name);//Here is the not occor name,not the SpeciesName;But I think we can use this super.
		this.nameNotoccor = nameNotoccor;
		this.speciesNeed = speciesNeed;
		this.song = song;
		this.animal = animal;
		this.name = name;
		this.getinway = getinway;
	}
	public String getGetinway()
	{
		return getinway;
	}
	public void setGetinway(String getinway)
	{
		this.getinway = getinway;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Animals getAnimal()
	{
		return animal;
	}
	public SpeciesNeed getSpeciesNeed()
	{
		return speciesNeed;
	}
	public boolean isNameAllowed()
	{
		return nameNotoccor;
	}
	public void setNameAllowed(boolean nameNotoccor)
	{
		this.nameNotoccor = nameNotoccor;
	}
	public void setSong(Song song)
	{
		song = song;
	}
	public Song getSong()
	{
		return song;
	}
}
