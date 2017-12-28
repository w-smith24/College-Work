//Wayne Smith
//Ciss 111
//SongLog subclass

import java.util.*;

public class SongLog extends AirTimeLog
{
  private String songId, songName, artistId;
  
  //Constructor for SongLog that sets songId, songName, and artistId
  public SongLog(String songId, String songName, String artistId)
  {   
    this.songId = songId;
    this.songName = songName;
    this.artistId = artistId;    
  } 
  
  //toString method for SongLog
  @Override
  public String toString()
  {
    return "\nSong ID: " + songId + "\nSong Name: " + songName + "\nArtist ID: " 
      + artistId + "\nTimestamp: " + getTime();
  }
}