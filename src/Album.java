import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    //constructors
    public Album (String name) {
        this.name = name;
    }
    public Album(String name, ArrayList<Song> songs) {
       this(name);
        this.songs = songs;
    }

    //getters
    public String getName() {
        return name;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Song findSong(String id) {
       if(songs == null) {
           return null;
       }
        for (Song song : songs) {
            if(song.getTitle().equals(id)) {
                return song;
            }

        }
        return null;
    }

    public void addSong(String title, String artist, int durations,String path) {
       if(findSong(title) == null) {
           Song newSong = new Song(title, artist, durations,path);
           songs.add(newSong);
           System.out.println("Song added: " + newSong.getTitle());
       }
       else {
           System.out.println("Song already exists: " + title);
       }


    }
}
