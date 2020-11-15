/*Heading to a desert island, cut off from the world, for the next six months. 
Luckily, I can bring a playlist of my favorite music*/

//importing ArrayList
import java.util.ArrayList;

//Creating PlayList class
class Playlist {
  
  // The main method
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

//Adding songs to playlist
    desertIslandPlaylist.add("24kGoldn - Mood Remix");
    desertIslandPlaylist.add("DaBaby - Rockstar");
    desertIslandPlaylist.add("NickelBack - How you remind me");
    desertIslandPlaylist.add("The 1975 - Chocolate");
    desertIslandPlaylist.add("Clean Bandit and Mabel - TikTok");
    desertIslandPlaylist.add("Dua Lipa - Levitating");
    desertIslandPlaylist.add("Lady Gaga - Applause");

//Printing out playlist and its size
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

//Removing songs from list
    desertIslandPlaylist.remove("NickelBack - How you remind me");
    desertIslandPlaylist.remove("The 1975 - Chocolate");

//Printing out remaining playlist and its size
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

//Swapping the order of two songs
     int indexA = desertIslandPlaylist.indexOf("24kGoldn - Mood Remix");
    int indexB = desertIslandPlaylist.indexOf("DaBaby - Rockstar");
    
    String tempA = "24kGoldn - Mood Remix";
    
    desertIslandPlaylist.set(indexA, "DaBaby - Rockstar");
    // System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}
