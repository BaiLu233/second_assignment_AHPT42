package model;
import java.io.*;

public class NoSongException extends Exception {
    String error;
    public NoSongException(String error)
    {
      this.error = error;
    }
   
    public String getNoSong()
    {
      return error;
    }
}
