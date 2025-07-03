import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Song s1 = new Song("blue","abc",123);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(s1);

    Album album= new Album ("playlist 1",songs);

    album.addSong("goosebumps","Travis scott", 210);
    album.addSong("butterfly effect","Travis", 210);
    album.addSong("butterfly effect","Travis", 210);


    }
}