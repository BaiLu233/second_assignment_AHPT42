import model.*;
import java.util.ArrayList;

public class Rafiki {
	public boolean isNameAllowed(Guest guest)
	{
		return guest.isNameAllowed();
	}
	
	public String getSpeciesNeed(Guest guest)
	{
		return guest.getSpeciesNeed().getNeed();
	}

	public String getAnimalNeed(Guest guest)
	{
		return  guest.getAnimal().getAnimalNeed().getNeed();
	}
	public String getBothNeeds(Guest guest)
	{
		if(isNameAllowed(guest))
            return guest.getKindName() + " needs :" + checkSpeciesNeed(guest) + " (SpeciesNeed), " + checkAnimalNeed(guest) + " (AnimalNeed)." ;
		
		else
            return guest.getAnimal().getKindName();
	}

}
