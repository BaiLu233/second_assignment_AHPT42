package model;
public abstract class Kind{
	private String name;
    public Kind(String name)//which is the species name;
	{
		this.name = name;
	}
    public String getKindName()
    {
        return name;
    }
    public void setKindName(String name){
        this.name = name;
    }


}
