import model.*;
import java.util.ArrayList;
import java.io.*;
public class Output{
	public void outputPlaylist(ArrayList<Song> Isplayedlist)
	{
		FileWriter out = null;
		try{
			out = new FileWriter("Isplayedlist.txt");
			out.write("Song's Name,which is played" );
			for(int i=0;i<Isplayedlist.size();i++)
			{
				out.write(Isplayedlist.get(i).getSong() + "," + Isplayedlist.get(i).isPlayed() );
			}
		}catch(IOException io)
		{
			System.out.println("error with outputing");
		}
	}
}
