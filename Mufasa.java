import model.*;
import java.util.ArrayList;
public class Mufasa {
    public static void registerGuest(ArrayList<Guest> guests,Guest newGuest)
	{
			guests.add(newGuest);
	}
    public static void removeGuest(ArrayList<Guest> guests,String name)
	{
			for(int i=0;i<guests.size();i++)
			{
				if(guests.get(i).getName().equals(name))
				{
						guests.remove(i);
				}
			}
	}
    public static boolean isInTheList(ArrayList<Guest> guests,String name)
	{
		boolean result = false;
		for(int i=0;i<guests.size();i++)
		{
			if(guests.get(i).getName().equals(name))
			{
				result = true;
			}
		}
		return result;
	}
}
