package model;
public class AnimalNeed implements Need{

private String need;
public AnimalNeed(String need)
{
	this.need = need;
}

@Override
public String getNeed()
{
	return need;
}

public void setNeed(String need)
{
	this.need = need;
}

}
