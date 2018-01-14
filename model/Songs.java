package model;
import java.util.ArrayList;
public class Songs
{
	private ArrayList <Song> songs = new ArrayList<>();
	
	public void addSong(Song newSong)
	{
		songs.add(newSong);
	}
	public void removeSong(int numberofsongs)
	{
		songs.remove(numberofsongs);
	}
	public void removeSong(Song song)
	{
		songs.remove(song);
	}
}
