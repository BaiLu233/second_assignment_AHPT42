import model.*;
import java.util.ArrayList;
public class Zazu{
    private static int k;
    public static void PickSong(ArrayList<Song> Isplayedlist) throws NoSongException
    {
        boolean error = false;
        int songcnt = 0;
        for(int j=0;j<Isplayedlist.size();j++){
        if( Isplayedlist.get(j).isPlayed()){
            songcnt++;
        }
    }
    if(songcnt == Isplayedlist.size())
    {
        error = true;
        throw new NoSongException("ERROR,NO SONG!");
    }
    if(!error)
    {
        for(int i=0;i<Isplayedlist.size();i++)
		{
			for(int j=0;j<Isplayedlist.size()-i-1;j++)
			{
				if(Isplayedlist.get(j).getSong().charAt(0) > Isplayedlist.get(j+1).getSong().charAt(0) )
				{
					Song tmp = Isplayedlist.get(j);
					Isplayedlist.set(j,Isplayedlist.get(j+1));
					Isplayedlist.set(j+1,tmp);
				}
			}
		}
		System.out.println("------------------------Song---------------------");
		System.out.println(Isplayedlist.get(k).getSong() + " is  picked and playing! ");
		System.out.println("-------------------------------------------------");
		Isplayedlist.get(k).isPlayed();
		k++;
	}

    }
    public static void removeSong_list(ArrayList<Song> Isplayedlist,String songname)
    {
        boolean res = false;
        for(int i=0;i<Isplayedlist.size();i++){
            if(Isplayedlist.get(i).getSong().equals(songname)){
                Isplayedlist.remove(Isplayedlist.get(i));
                res = true;
            }
        }
        if(res){
            System.out.println("success");
        }else{
            System.out.println("Not successs");
        }

    }
    public static ArrayList<Song> playedSong(ArrayList<Song> Isplayedlist)
    {
        ArrayList<Song> playedSongs = new ArrayList<>();
	
        for(int i=0;i<Isplayedlist.size();i++)
        {
			if(Isplayedlist.get(i).isPlayed())
				playedSongs.add(Isplayedlist.get(i));
			
        }
        return playedSongs;
        
    }
    public static void songlist(ArrayList<Song> Isplayedlist)
    {
        for(int i=0;i<Isplayedlist.size();i++)
        {
        System.out.println((i+1) + " : "+ Isplayedlist.get(i).getSong());
	}
	
    }
    public static void nonPlayed(ArrayList<Song> Isplayedlist)
    {
        ArrayList<Song> nonplayedSongs = new ArrayList<>();
	
        for(int i=0;i<Isplayedlist.size();i++)
        {
            if(!Isplayedlist.get(i).isPlayed())
				nonplayedSongs.add(Isplayedlist.get(i));
				
        }
	
    }
    public static void nonPlayedPrint(ArrayList<Song> Isplayedlist)
    {
        ArrayList<Song> nonplayedSongs = new ArrayList<>();
	
        for(int i=0;i<Isplayedlist.size();i++)
        {
            if(!Isplayedlist.get(i).isPlayed())
				System.out.println((i+1)+" ： " + Isplayedlist.get(i).getSong());
				
        }
	
    }
    public static void shuffle(ArrayList<Song> Isplayedlist)
    {
        for(int i=0;i<Isplayedlist.size();i++){
            Isplayedlist.get(i).setNotplayed();
        }
    }


}
