package model;
public class Song{
	public String songName;
	public  boolean isPlayed;
	public Song(String songName)
	{
		this.songName = songName;
		isPlayed = false;
	}
	public String getSong()
	{
		return songName;
	}
	public void setSong(String songName)
	{
		this.songName = songName;
	}
	public void setPlayed()
	{
		isPlayed = true;
	}
    public void setNotplayed()
    {
        isPlayed = false;
    }
	public boolean isPlayed()
	{
		return isPlayed;
	}

}
